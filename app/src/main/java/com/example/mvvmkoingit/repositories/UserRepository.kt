package com.example.mvvmkoingit.repositories

import com.example.mvvmkoingit.models.User

interface UserRepository {

    suspend fun getAllUsers(): List<User>

}