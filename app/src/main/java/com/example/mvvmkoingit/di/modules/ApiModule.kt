package com.example.mvvmkoingit.di.modules

import com.example.mvvmkoingit.rest.RetrofitClient
import org.koin.dsl.module

var apiModule = module {

    single { RetrofitClient.userApi }

}