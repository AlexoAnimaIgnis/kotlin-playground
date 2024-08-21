package com.kotlinplayground

import com.kotlinplayground.classes.Course

fun checkType(type: Any) {
    when(type) {
        is Course -> {
            // automatically converts to its appropriate type
            println(type)
        }
        is String -> {
            println(type.toLowerCase())
        }
    }
}

fun castNumber(d: Any) {
    when(d) {
        d as Double -> println("Value is Double")
    }
}


fun main() {
    val course = Course(1, "reactive", "alexo")
    checkType(course)
    checkType("ALEXO")

    castNumber(1.0)
    val db = 1
    castNumber(db.toDouble())
}


