package edu.uc.rosemajm.logincabin.dto

import androidx.lifecycle.MutableLiveData
import edu.uc.rosemajm.logincabin.dao.ApplicationsDAO
import edu.uc.rosemajm.logincabin.ui.main.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApplicationsServiceDTO {

    fun fetchApplications(): MutableLiveData<ArrayList<ApplicationsDTO>> {

        var applications = MutableLiveData<ArrayList<ApplicationsDTO>> ()
        val service = RetrofitClientInstance.retrofitInstance?.create(ApplicationsDAO::class.java)
        service?.getAllApplications()
        val call = service?.getAllApplications()
        call?.enqueue(object: Callback<ArrayList<ApplicationsDTO>> {
            override fun onResponse(
                call: Call<ArrayList<ApplicationsDTO>>,
                response: Response<ArrayList<ApplicationsDTO>>
            ) {
                applications.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<ApplicationsDTO>>, t: Throwable) {

            }

        })

        return applications
    }
}