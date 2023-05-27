package com.example.mvvmkoingit.api

import com.example.mvvmkoingit.models.User
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UserApi {

    @GET("/users")
    suspend fun getAllUsers(): List<User>


    companion object {
        private var retrofitService: UserApi? = null

        fun getInstance(): UserApi {
            if (retrofitService == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

                retrofitService = retrofit.create(UserApi::class.java)
            }

            return retrofitService!!
        }
    }
}