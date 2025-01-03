package structural.decorator

fun main(){
    val networkRequest = BaseNetworkRequest()
    val cacheDecorator = CacheDecorator(networkRequest)
    val loggingDecorator = LoggingDecorator(cacheDecorator)
    loggingDecorator.request()

    val notification = BasicNotification()
    val smsNotification = SMSNotification(notification)
    smsNotification.send("Hello")

    val customView = BaseView()
    val borderDecorator = BorderDecorator(customView)
    val shadowEffect = ShadowEffect(borderDecorator)
    shadowEffect.draw()
}