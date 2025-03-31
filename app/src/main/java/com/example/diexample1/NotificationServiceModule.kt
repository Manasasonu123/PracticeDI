package com.example.diexample1

import dagger.Module
import dagger.Provides
import jakarta.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @Singleton
    @MessageQualifier
    @Provides
    fun getMessageService(retryCount:Int):NotificationService{
        return MessageService(retryCount)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService):NotificationService{
        return EmailService()
    }
}