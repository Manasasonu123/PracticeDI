package com.example.diexample1

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getFirebaseRepository():UserRepository{
//        return FirebaseRepository()
//    }
    @Singleton
    @Binds
    abstract fun getSQLRepository(sqlRepository: SQLRepository):UserRepository
}