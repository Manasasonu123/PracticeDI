package com.example.diexample1

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String)
    fun datasent(body: String)
}
@Singleton
class EmailService @Inject constructor():NotificationService{
    override fun send(to:String,from:String,body:String){
        Log.d(TAG,"Email Sent from "+from+" to "+to);
    }

    override fun datasent(body:String){
        Log.d(TAG,"Email content: "+body)
    }
}
class MessageService(private val retryCount:Int):NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG,"Message content-RetryCount: $retryCount")
    }

    override fun datasent(body: String) {
        Log.d(TAG,"Message body")
    }

}