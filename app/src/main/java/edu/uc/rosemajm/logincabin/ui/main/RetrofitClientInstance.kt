package edu.uc.rosemajm.logincabin.ui.main

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {

    private var retrofit: Retrofit? = null
    private val BASE_URL = "https://pkgstore.datahub.io"

    val retrofitInstance : Retrofit?
        get () {

            //if retro is not created
            if (retrofit == null) {

                // create it
                retrofit = retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return retrofit
        }
}