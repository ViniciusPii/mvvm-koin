package com.example.mvvmkoingit.view.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmkoingit.models.User
import com.example.mvvmkoingit.repositories.UserRepository
import kotlinx.coroutines.launch

class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getAllUsers() = viewModelScope.launch {
        val users: List<User> = userRepository.getAllUsers()

        for (user in users) {
            Log.i("Users", user.login)
        }

    }
}