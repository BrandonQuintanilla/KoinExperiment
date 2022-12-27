package com.example.koinexperiment

import android.app.Application
import com.example.koinexperiment.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by Brandon Quintanilla on Dec/27/2022
 */
class MainApplication : Application(){
    override fun onCreate() {
        super.onCreate()

        //Koin needs to be started from global context
        startKoin{
            androidLogger()
            androidContext(this@MainApplication)
            modules(appModule)
        }
    }
}