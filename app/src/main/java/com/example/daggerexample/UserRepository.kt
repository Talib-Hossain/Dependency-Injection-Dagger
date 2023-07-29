package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor():UserRepository {

    override fun saveUser(email: String, password: String){
        Log.d("Dagger","User saved in DB")
    }
}

class FireBaseRepository():UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d("Dagger","User saved in Firebase")
    }

}