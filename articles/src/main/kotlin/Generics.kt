import kotlin.random.Random


//From https://kt.academy/article/kfde-generics

fun main(){
    genericFun<Int>()
    genericFun<String>()
    multipleGenericFun<String, Int>()

    id(12)
    id("Hello")
    randomOf(12, "kjh")
}


fun <T> genericFun(){}
fun <T1, T2> multipleGenericFun(){}

// The result type is the same as the argument type
fun <T> id(value: T): T = value

// The result type is the closest supertype of arguments
fun <T> randomOf(a: T, b: T): T = if (Random.nextBoolean()) a else b

fun reverseList(list: List<Any>): List<Any> {
    return list.asReversed()
}

fun <T> reverseList(list: List<T>): List<T>{
    return list.asReversed()
}
