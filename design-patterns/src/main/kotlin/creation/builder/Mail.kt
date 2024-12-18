package org.theberdakh.creation.builder

data class Mail(
    val from: String,
    val to: String,
) {
    var message: String = ""
}

fun main(){
    Mail(from = "me@mail.com", to = "to@mail.com").apply {
        message = "Hello"
    }
}
