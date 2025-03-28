package com.example.diexample1

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String)
    fun datasent(body: String)
}

class EmailService @Inject constructor():NotificationService{
    override fun send(to:String,from:String,body:String){
        Log.d(TAG,"Email Sent from "+from+" to "+to);
    }

    override fun datasent(body:String){
        Log.d(TAG,"Email content: "+body)
    }
}
class MessageService:NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d(TAG,"Message sent")
    }

    override fun datasent(body: String) {
        Log.d(TAG,"Message content")
    }

}