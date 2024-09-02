package com.kotlinplayground.exceptions

fun main() {
    println("Name length is ${nameLength("alexo")}")
    println("Name length is ${nameLength(null)}")
}

/**
 * try catch block is also an expression
 */
fun nameLength(name: String?): Int? {
    val result = try {
        name!!.length
    } catch (ex: Exception) {
        println("Encountered Exception!")
        null
    }
    return result
}
