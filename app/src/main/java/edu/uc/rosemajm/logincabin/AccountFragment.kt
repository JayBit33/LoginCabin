package edu.uc.rosemajm.logincabin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import edu.uc.rosemajm.logincabin.dto.Account
import edu.uc.rosemajm.logincabin.ui.main.MainFragment
import edu.uc.rosemajm.logincabin.ui.main.MainViewModel
import kotlinx.android.synthetic.main.account_fragment.*
import kotlinx.android.synthetic.main.account_fragment.btnLogon

class AccountFragment : MainFragment() {

    private lateinit var viewModel: MainViewModel
    private lateinit var accountFragment: AccountFragment
    private lateinit var mainFragment: MainFragment
    private lateinit var activeFragment: Fragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.account_fragment, container, false)
    }



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        btnLogon.setOnClickListener {
            logon()
        }
        imageView.setOnClickListener {
            saveAccount() }

    }

    private fun saveAccount(){
        var account = Account().apply {
             username = editText.toString()
             password = lblPassword.text.toString()
             notes = editText3.text.toString()
        }
    }




}
