package com.example.koinexperiment.utility

/**
 * Created by Brandon Quintanilla on Dec/27/2022
 */
interface UserRepository {
    fun findUser(name : String): User?
    fun addUsers(users : List<User>)
}