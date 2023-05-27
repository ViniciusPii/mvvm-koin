package com.example.mvvmkoingit.api

import com.example.mvvmkoingit.models.User
import retrofit2.http.GET

interface UserApi {

    @GET("/users")
    suspend fun getAllUsers(): List<User>

}