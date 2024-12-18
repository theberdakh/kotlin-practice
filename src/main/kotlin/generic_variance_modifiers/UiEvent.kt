package generic_variance_modifiers


interface UiEvent<in T> {
    fun handle(event: T)
}

class Error(val text: String)

interface EventHandler {
    fun handle()
}

class ErrorHandler: UiEvent<Error>{
    override fun handle(event: Error) {
        println(event.text)
    }
}
