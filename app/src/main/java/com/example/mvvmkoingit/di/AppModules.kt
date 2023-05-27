package com.example.mvvmkoingit.di

import com.example.mvvmkoingit.di.modules.apiModule
import com.example.mvvmkoingit.di.modules.repositoriesModule
import com.example.mvvmkoingit.di.modules.viewModelsModule

val appModules = listOf(
    apiModule,
    repositoriesModule,
    viewModelsModule
)