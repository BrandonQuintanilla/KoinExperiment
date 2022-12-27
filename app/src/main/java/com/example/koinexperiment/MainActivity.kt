package com.example.koinexperiment

//import org.koin.java.KoinJavaComponent.inject
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.koinexperiment.presentation.UserViewModel
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val presenter: UserPresenter by inject()

    //The by viewModel() function allows us to retrieve a ViewModel instances, create the associated ViewModel Factory for you and bind it to the lifecycle
    private val userViewModel: UserViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("MainActivity-LOG", "presenter: ${presenter.sayHello("Brandon")}")
        Log.i("MainActivity-LOG", "userViewModel: ${userViewModel.sayHello("Brandon")}")

    }
}