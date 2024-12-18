package org.theberdakh.creation.factory

interface Shape {

    fun draw()
}

class Circle : Shape {
    override fun draw() {
        println("Circle")
    }
}

class Triangle : Shape {
    override fun draw() {
        println("Triangle")
    }
}

class Square : Shape {
    override fun draw() {
        println("Square")
    }
}

enum class ShapeTypes {
    CIRCLE, TRIANGLE, SQUARE
}
object ShapeFactory {
    fun createShape(type: ShapeTypes): Shape {
        return when (type) {
            ShapeTypes.CIRCLE -> Circle()
            ShapeTypes.TRIANGLE -> Triangle()
            ShapeTypes.SQUARE -> Square()
        }
    }
}

fun main() {
    val shapes = listOf(ShapeTypes.CIRCLE, ShapeTypes.TRIANGLE, ShapeTypes.SQUARE)
    for (shape in shapes){
       val instance = ShapeFactory.createShape(shape)
        instance.draw()
    }
}