package edu.uc.rosemajm.logincabin.ui.main

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import edu.uc.rosemajm.logincabin.dto.AccountDTO
import edu.uc.rosemajm.logincabin.dto.ApplicationsDTO
import edu.uc.rosemajm.logincabin.dto.ApplicationsServiceDTO

class MainViewModel : ViewModel() {

    private var _applications : MutableLiveData<ArrayList<ApplicationsDTO>> = MutableLiveData<ArrayList<ApplicationsDTO>>()
    private var applicationService : ApplicationsServiceDTO = ApplicationsServiceDTO()
    private lateinit var firestore : FirebaseFirestore


    init {
        fetchApplications("e")
        firestore = FirebaseFirestore.getInstance()
        firestore.firestoreSettings = FirebaseFirestoreSettings.Builder().build()
    }

    fun fetchApplications(appName: String) {
        _applications = applicationService.fetchApplications()

    }

    fun save(account : AccountDTO) {

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

    internal var applications:MutableLiveData<ArrayList<ApplicationsDTO>>
         get() {return _applications}
        set(value) {_applications = value}

}
