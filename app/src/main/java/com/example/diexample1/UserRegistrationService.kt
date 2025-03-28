package com.example.diexample1

import jakarta.inject.Named
import javax.inject.Inject

class UserRegistrationService @Inject constructor(private val userRepository: UserRepository,
                              @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        notificationService.send(email,"mns@gmail.com","Hello User...")
    }
}