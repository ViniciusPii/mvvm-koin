package com.example.mvvmkoingit.di.modules

import com.example.mvvmkoingit.repositories.UserRepository
import com.example.mvvmkoingit.repositories.UserRepositoryImpl
import org.koin.dsl.module

val repositoriesModule = module {

    single<UserRepository> { UserRepositoryImpl(userApi = get()) }

}