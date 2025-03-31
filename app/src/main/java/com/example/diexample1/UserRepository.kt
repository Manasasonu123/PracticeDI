package com.example.diexample1

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository{
    fun saveUser(email:String,password:String)
}

@Singleton
class SQLRepository @Inject constructor(val analyticsService:AnalyticsService):UserRepository{
    override fun saveUser(email:String, password:String){
        Log.d(TAG,"User saved in a DB")
        analyticsService.trackEvenet("Save User","CREATE")
    }
}
class  FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG,"User saved in Firebase")
        analyticsService.trackEvenet("Save User","CREATE")
    }

}