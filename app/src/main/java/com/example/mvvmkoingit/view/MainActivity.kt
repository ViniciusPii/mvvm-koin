package com.example.mvvmkoingit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmkoingit.api.UserApi
import com.example.mvvmkoingit.databinding.ActivityMainBinding
import com.example.mvvmkoingit.repositories.UserRepositoryImpl
import com.example.mvvmkoingit.view.factories.UserViewModelFactory
import com.example.mvvmkoingit.view.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val userApi: UserApi = UserApi.getInstance()

        val userRepository = UserRepositoryImpl(userApi = userApi)

        val userViewModel = ViewModelProvider(
            owner = this,
            UserViewModelFactory(userRepository)
        )[UserViewModel::class.java]

        binding.button.setOnClickListener {
            userViewModel.getAllUsers()
        }
    }
}