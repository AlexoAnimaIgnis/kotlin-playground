package com.kotlinplayground.basics

fun main() {
    // break statement : break the control flow and go to next statement

    for(i in 1..5) {
        println("i in $i")
        if(i == 3) break
    }

    label()

    println("End of program")
}

fun label() {

    loop@ for(i in 1..5) {
        println("i in label $i")
        if(i == 3) break@loop
    }
    println("end of label")
}
