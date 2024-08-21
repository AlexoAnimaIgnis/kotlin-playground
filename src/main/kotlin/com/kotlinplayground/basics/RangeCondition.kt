package com.kotlinplayground.basics

fun main() {
    val range = 1..10 // starting value .. end value
    for(i in range) {
        println("$i")
    }

    // reverse range
    val reverseRange = 10 downTo 1
    for(i in reverseRange) {
        println("reverse range: $i")
    }

    // skip values
    for(i in reverseRange step 2) {
        println("skipped range: $i")
    }

    exploreWhile()
    exploreDoWhile()
}

fun exploreDoWhile() {
    var i = 0
    do {
        println("Value of i : $i")
        i++
    }while (i < 5)
}

fun exploreWhile() {
    var x = 1
    while(x < 5) {
        println("value of x: $x")
        x++
    }
}
