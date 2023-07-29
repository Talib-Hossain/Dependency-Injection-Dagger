package com.example.daggerexample

import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Factory
    interface factory{
        fun create(@BindsInstance retryCount: Int):UserRegistrationComponent
    }
}