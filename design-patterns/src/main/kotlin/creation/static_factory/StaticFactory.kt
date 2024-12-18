package org.theberdakh.creation.static_factory

class StaticFactory private constructor(private val a: Int){
    companion object {
        fun create(a: Int): StaticFactory {
            return StaticFactory(a)
        }
    }
}

fun main(){
  //  val a = StaticFactory() won't work
    val b = StaticFactory.create(2)

    val threads = List(100) {
        Thread {
            println("Instance: $b")
        }
    }

    threads.forEach {
        it.start()
    }
    threads.forEach {
        it.join()
    }
}