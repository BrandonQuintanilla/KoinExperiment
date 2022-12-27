package com.example.koinexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
//import org.koin.java.KoinJavaComponent.inject
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val presenter: UserPresenter by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity", "onCreate: ${presenter.sayHello("Brandon")}")

    }
}