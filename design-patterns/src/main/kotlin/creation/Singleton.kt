package org.theberdakh.creation

object Singleton {
    val a = 10
}
class NotSingletonClass

class LazySingleton private constructor(){
    companion object {
        @Volatile
        private var instance: LazySingleton? = null

        fun getInstance(): LazySingleton {
            return instance ?: synchronized(this){
                instance ?: LazySingleton().also {
                    instance = it
            }
        }
    }
}}

fun main(){
  val threads = List(100) {
      Thread {
          val instance = LazySingleton.getInstance()
          val instance2 = LazySingleton.getInstance()

          println("Instance: $instance")
          println("Instance are same: ${instance === instance2}")
      }
  }

    threads.forEach {
        it.start()
    }
    threads.forEach {
        it.join()
    }
}