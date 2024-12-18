package generic_variance_modifiers

interface Message

interface Sender<T: Message>{
    fun send(message: Message)
}

class ReportMessage(val reason: String): Message

class Consume<in T>(val name: String){
    fun consume(value: T){
        println("Consuming: $value")
    }
}



fun main(){
    val a = Consume<Int>("a")
    emptyList<Int>()
}