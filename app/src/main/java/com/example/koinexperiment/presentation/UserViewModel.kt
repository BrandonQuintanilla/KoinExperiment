package com.example.koinexperiment.presentation

import androidx.lifecycle.ViewModel
import com.example.koinexperiment.utility.User
import com.example.koinexperiment.utility.UserRepository

/**
 * Created by Brandon Quintanilla on Dec/27/2022
 */
class UserViewModel(private val repository: UserRepository) : ViewModel() {

    init {
        repository.addUsers(listOf(User("Brandon"), User("Nadiana")))
    }

    fun sayHello(name : String) : String{
        val foundUser = repository.findUser(name)
        return foundUser?.let { "Hello '$it' from $this" } ?: "User '$name' not found!"
    }
}