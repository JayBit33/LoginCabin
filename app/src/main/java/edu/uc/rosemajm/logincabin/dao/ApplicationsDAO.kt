package edu.uc.rosemajm.logincabin.dao

import edu.uc.rosemajm.logincabin.dto.ApplicationsDTO
import retrofit2.Call
import retrofit2.http.GET

interface ApplicationsDAO {

    // No link after @GET becasue we have no link for the json data yet.

    @GET("")
    fun getAllApplications (): Call<ArrayList<ApplicationsDTO>>
}