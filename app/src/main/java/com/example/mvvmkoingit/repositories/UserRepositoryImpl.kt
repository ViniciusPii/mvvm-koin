package com.example.mvvmkoingit.repositories

import com.example.mvvmkoingit.api.UserApi
import com.example.mvvmkoingit.models.User

class UserRepositoryImpl(
    private val userApi: UserApi
) : UserRepository {

    override suspend fun getAllUsers(): List<User> = userApi.getAllUsers()

}