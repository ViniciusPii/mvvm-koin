package com.example.mvvmkoingit.view.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmkoingit.repositories.UserRepository
import com.example.mvvmkoingit.view.viewmodel.UserViewModel

class UserViewModelFactory(
    private val repository: UserRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(UserViewModel::class.java)) {
            UserViewModel(this.repository) as T
        } else {
            throw IllegalArgumentException("ViewModel Error")
        }
    }
}