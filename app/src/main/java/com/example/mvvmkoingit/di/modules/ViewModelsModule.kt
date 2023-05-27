package com.example.mvvmkoingit.di.modules

import com.example.mvvmkoingit.view.viewmodel.UserViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {

    viewModel { UserViewModel(userRepository = get()) }

}