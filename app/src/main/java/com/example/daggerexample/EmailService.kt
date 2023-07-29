package com.example.daggerexample

import android.util.Log
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String)

}

class EmailService @Inject constructor():NotificationService {

    override fun send(to: String, from: String, body: String) {
        Log.d("Dagger", "Email Sent")
    }
}

class MessageService(private val retryCount: Int): NotificationService{
    override fun send(to: String, from: String, body: String) {
        Log.d("Dagger","Message Sent - Retry Count $retryCount")
    }
}