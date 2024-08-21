package com.kotlinplayground.classes

class InitOrderDemo(name:String) {
    val firstProperty = "First property: $name".also(::println)

    init {
        println("first initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("second initializer block that prints ${name.length}")
    }
}

fun main() {
    InitOrderDemo("alexo")
}