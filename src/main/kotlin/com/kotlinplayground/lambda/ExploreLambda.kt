package com.kotlinplayground.lambda


// high-ordered function -> a function that accepts another function
fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

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

    val result = multiplyLambda(2, 3)
    println("multiple result : $result")

    //calculate(2, 3, {a, b -> a *b})
    val highOrderResult1 = calculate(2, 3) { a, b -> a * b } // if lambda is the last argument of the method, we can put it outside
    println("Result is: " + highOrderResult1)


    val highOrderResult2 = calculate(2, 3, { a, b -> a + b })
    println("Result is: " + highOrderResult2)
}