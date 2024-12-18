package org.theberdakh.creation.factory

interface Notification{
    fun sendMessage(message: String)
}

class SMSNotification: Notification {
    override fun sendMessage(message: String) {
     println("SMS $message")
    }
}

class EmailNotification: Notification {
    override fun sendMessage(message: String) {
        println("Email: $message")
    }
}

enum class NotificationType{
    SMS, EMAIL
}

object NotificationFactory{
    fun createNotification(type: NotificationType): Notification {
        return when(type){
            NotificationType.SMS -> SMSNotification()
            NotificationType.EMAIL -> EmailNotification()
        }
    }
}

fun main(){
    val notification = NotificationFactory.createNotification(NotificationType.SMS)
    notification.sendMessage("1994")
}