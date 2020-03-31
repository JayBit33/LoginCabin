package edu.uc.rosemajm.logincabin.service

import androidx.lifecycle.MutableLiveData
import edu.uc.rosemajm.logincabin.dao.ApplicationsDAO
import edu.uc.rosemajm.logincabin.dto.Applications
import edu.uc.rosemajm.logincabin.ui.main.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApplicationsService {

    fun fetchApplications(appName: String): MutableLiveData<ArrayList<Applications>> {

        var _applications = MutableLiveData<ArrayList<Applications>> ()
        val service = RetrofitClientInstance.retrofitInstance?.create(ApplicationsDAO::class.java)
        service?.getAllApplications()
        val call = service?.getAllApplications()
        call?.enqueue(object: Callback<ArrayList<Applications>> {
            override fun onResponse(
                call: Call<ArrayList<Applications>>,
                response: Response<ArrayList<Applications>>
            ) {
                _applications.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<Applications>>, t: Throwable) {
                val j = 1+1
                val i = 1 + 1
            }

        })

        return _applications
    }
}