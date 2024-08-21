package com.kotlinplayground.basics

fun main() {
    // if else : in kotlin, if else block is an expression, meaning expression always return a result

    val name = "Alexo"
    val result = if(name.length == 5) {
        println("name is 5 characters")
        name
    } else {
        println("Name is not our 5 characters")
        name
    }

    println("result : $result")

    // 1 -> GOLD, 2 -> SILVER, 3 -> BRONZE

    val position = 4
    val medal1 = if(position == 1) {
        "GOLD"
    } else if(position == 2) {
        "SILVER"
    } else if(position == 3 ) {
        "BRONZE"
    } else {
        "NO MODAL"
    }

    // when block
    val medal = when(position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }

    println(medal)

}