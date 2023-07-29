package com.example.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService

    @Inject
    lateinit var emailService: EmailService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component= DaggerUserRegistrationComponent.factory().create(3)
        component.inject(this)
        userRegistrationService.registerUser("talibhossain@gmail.com","Talib2002")
    }
}