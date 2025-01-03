package structural.decorator

interface NetworkRequest {
    fun request()
}

class BaseNetworkRequest: NetworkRequest {
    override fun request() {
        println("Base network request")
    }
}

abstract class NetworkRequestDecorator(private val networkRequest: NetworkRequest): NetworkRequest {
    override fun request() {
        networkRequest.request()
    }
}

class CacheDecorator(networkRequest: NetworkRequest): NetworkRequestDecorator(networkRequest){
    override fun request() {
        super.request()
        cache()
    }
    private fun cache() {
        println("Cache request")
    }
}

class LoggingDecorator(networkRequest: NetworkRequest): NetworkRequestDecorator(networkRequest) {
    override fun request() {
        super.request()
        logIt()
    }

    private fun logIt() {
        println("Log request")
    }
}

