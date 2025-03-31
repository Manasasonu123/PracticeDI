package com.example.diexample1

import android.content.ContentValues.TAG
import android.util.Log

interface AnalyticsService {
    fun trackEvenet(eventName:String,eventtype:String)
}
class MixPanel:AnalyticsService{
    override fun trackEvenet(eventName: String, eventtype: String) {
        Log.d(TAG,"MixPanel- $eventName - $eventtype")
    }
}
class Firebase:AnalyticsService{
    override fun trackEvenet(eventName: String, eventtype: String) {
        Log.d(TAG,"Firebase - $eventName - $eventtype")
    }

}