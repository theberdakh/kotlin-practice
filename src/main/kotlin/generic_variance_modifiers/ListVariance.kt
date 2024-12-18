package generic_variance_modifiers

interface Device {
    fun work()
}

class Phone(private val name: String): Device {
    override fun work() {
        println("Phone: $name")
    }
}

class Computer(private val name: String): Device {
    override fun work() {
        println("Computer: $name")
    }
}

fun main(){
    val devices = listOf(Phone("Iphone"), Computer("HP"))
    startDevices(devices)
}

fun startDevices(devices: List<Device>){
    for (device in devices){
        device.work()
    }
}