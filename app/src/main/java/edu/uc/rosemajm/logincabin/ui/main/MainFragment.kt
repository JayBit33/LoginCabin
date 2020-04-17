package edu.uc.rosemajm.logincabin.ui.main

import android.app.Activity.RESULT_OK
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import edu.uc.rosemajm.logincabin.R
import kotlinx.android.synthetic.main.main_fragment.*

open class MainFragment : Fragment() {
    private lateinit var viewModel: MainViewModel
    private val AUTH_REQUEST_CODE = 2000
    private var user : FirebaseUser? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        btnLogon.setOnClickListener {
            logon()
        }
    }


    fun logon() {
        var providers = arrayListOf(
            AuthUI.IdpConfig.EmailBuilder().build()
        )
        startActivityForResult(
            AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).build() , AUTH_REQUEST_CODE
        )
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == RESULT_OK){
            if (resultCode == AUTH_REQUEST_CODE)
                user =  FirebaseAuth.getInstance().currentUser
        }
    }



}
