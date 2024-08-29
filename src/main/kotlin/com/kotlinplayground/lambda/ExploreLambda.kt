package com.kotlinplayground.lambda

fun main() {
    val add = { x: Int -> x + x } // similar to fun add(x:Int) = x+x

    listOf(1, 2, 3)
        .forEach {
            val result = add(it) // we can invoke lambda as a function
            println("addResult : $result")
        }

    val multiplyLambda = { x: Int, y: Int ->
        println("multiply $x * $y")
        x * y  // last statement will be returned in multiline lambda
    }
    val result = multiplyLambda(2,3)
    println("multiple result : $result")
}