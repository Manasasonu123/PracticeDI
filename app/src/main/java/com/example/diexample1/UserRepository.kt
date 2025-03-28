package com.example.diexample1

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email:String,password:String)
}

class SQLRepository @Inject constructor():UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in a DB")
    }
}
class  FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase")
    }

}