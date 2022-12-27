package com.example.koinexperiment.di

import com.example.koinexperiment.UserPresenter
import com.example.koinexperiment.utility.UserRepository
import com.example.koinexperiment.utility.UserRepositoryImpl
import org.koin.dsl.module

/**
 * Created by Brandon Quintanilla on Dec/27/2022
 */
val appModule = module {

    //Allows us to create a singleton of UserRepository by creating an instance of UserRepositoryImpl
    single<UserRepository> { UserRepositoryImpl() }


    //We declare it as a factory definition, to not keep any instance in memory
    //(avoid any leak with Android lifecycle)
    //get() finds a koin instance to provide it to out new UserPresenter instance
    factory { UserPresenter(get()) }
}