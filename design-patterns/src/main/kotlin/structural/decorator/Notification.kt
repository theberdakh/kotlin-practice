package structural.decorator

interface Notification {
    fun send(message: String)
}

class BasicNotification : Notification {
    override fun send(message: String) {
        println("Basic notification: $message")
    }
}

abstract class NotificationDecorator(private  val notification: Notification): Notification {
    override fun send(message: String) {
        notification.send(message)
    }
}

class SMSNotification(notification: Notification): NotificationDecorator(notification){
    override fun send(message: String) {
        super.send(message)
        doAnotherThings()
    }

    private fun doAnotherThings() {
        println("SMS notification: do another things")
    }
}

