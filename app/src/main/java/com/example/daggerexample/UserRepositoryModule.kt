package com.example.daggerexample

import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository():UserRepository{
        return FireBaseRepository()
    }
}