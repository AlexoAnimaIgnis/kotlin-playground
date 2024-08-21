package com.kotlinplayground.functions

val coursename = "Kotlin Programming"

fun topLevelFunction(): Int{
    return (0..100).random()
}

fun main() {
    val num = topLevelFunction()
    println("Num is : $num")
}