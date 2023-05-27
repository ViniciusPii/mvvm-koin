package com.example.mvvmkoingit.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmkoingit.databinding.ActivityMainBinding
import com.example.mvvmkoingit.view.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val userViewModel: UserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            userViewModel.getAllUsers()
        }
    }
}