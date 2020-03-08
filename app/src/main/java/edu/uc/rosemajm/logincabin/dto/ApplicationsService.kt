package edu.uc.rosemajm.logincabin.dto

import androidx.lifecycle.MutableLiveData
import edu.uc.rosemajm.logincabin.dao.ApplicationsDAO
import edu.uc.rosemajm.logincabin.ui.main.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

// This will fetch the application service data

class ApplicationsService {

    fun fetchApplications(appName: String): MutableLiveData<ArrayList<Applications>> {

        var applications = MutableLiveData<ArrayList<Applications>> () // Variable should start with the lowercase
        val service = RetrofitClientInstance.retrofitInstance?.create(ApplicationsDAO::class.java)
        service?.getAllApplications()
        val call = service?.getAllApplications()
        call?.enqueue(object: Callback<ArrayList<Applications>> {
            override fun onResponse(
                call: Call<ArrayList<Applications>>,
                response: Response<ArrayList<Applications>>
            ) {
                applications.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<Applications>>, t: Throwable) {  // Looks like this might need some more work for exceptions  since it's variable are never used
                val j = 1+1
                val i = 1 + 1
            }

        })

        return applications
    }
}