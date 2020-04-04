package edu.uc.rosemajm.logincabin.ui.main

import android.app.Application
import android.util.Log
import androidx.core.app.ActivityCompat.startActivityForResult
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.firebase.ui.auth.AuthUI
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import edu.uc.rosemajm.logincabin.dto.Account
import edu.uc.rosemajm.logincabin.dto.Applications
import edu.uc.rosemajm.logincabin.dto.ApplicationsService

class MainViewModel : ViewModel() {

    private var _applications : MutableLiveData<ArrayList<Applications>> = MutableLiveData<ArrayList<Applications>>()
    private var applicationService : ApplicationsService = ApplicationsService()
    private lateinit var firestore : FirebaseFirestore


    init {
        fetchApplications("e")
        firestore = FirebaseFirestore.getInstance()
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder().build()
    }

    fun fetchApplications(appName: String) {
        _applications = applicationService.fetchApplications(appName)

    }

    fun save(account : Account) {

            val document =   firestore.collection("accounts").document()
          account.accountId = document.id
            val set = document.set(account)
            set.addOnSuccessListener {
                Log.d("Firebase", "document saved")
            }
            set.addOnFailureListener {
                Log.d("Firebase", "save failed")
            }

    }

    internal var applications:MutableLiveData<ArrayList<Applications>>
         get() {return _applications}
        set(value) {_applications = value}

}
