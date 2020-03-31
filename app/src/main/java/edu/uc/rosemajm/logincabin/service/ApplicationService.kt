package edu.uc.rosemajm.logincabin.service

import androidx.lifecycle.MutableLiveData
import edu.uc.rosemajm.logincabin.dao.ApplicationsDAO
import edu.uc.rosemajm.logincabin.dto.Application
import edu.uc.rosemajm.logincabin.ui.main.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ApplicationService {

    fun fetchApplications(appName: String): MutableLiveData<ArrayList<Application>> {

        var _applications = MutableLiveData<ArrayList<Application>> ()
        val service = RetrofitClientInstance.retrofitInstance?.create(ApplicationsDAO::class.java)
        service?.getAllApplications()
        val call = service?.getAllApplications()
        call?.enqueue(object: Callback<ArrayList<Application>> {
            override fun onResponse(
                call: Call<ArrayList<Application>>,
                response: Response<ArrayList<Application>>
            ) {
                _applications.value = response.body()
            }

            override fun onFailure(call: Call<ArrayList<Application>>, t: Throwable) {
                val j = 1+1
                val i = 1 + 1
            }

        })

        return _applications
    }
}