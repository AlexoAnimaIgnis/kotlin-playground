package com.kotlinplayground.functions

import java.time.LocalDate


fun printName(s: String): Unit { // similar to void type in java
    println("Name is: $s")
}

fun addition_approach1(x: Int, y: Int): Int {
    return x + y
}

fun addition_approach2(x: Int, y: Int) = x + y

fun printPersonDetails(
    name: String,
    email: String = "",
    dob: LocalDate = LocalDate.now()
) {
    println("Name is $name and the email is $email and the dob is $dob")
}

fun main() {
    printName("Alexo")
    val result = addition_approach1(1,2)
    val result2 = addition_approach2(1,2)
    println("result is $result")
    println("result is $result2")

    printPersonDetails("alexo", "abc@gmail.com", LocalDate.parse("2024-01-01"))
    printPersonDetails("alexo")
    printPersonDetails(dob = LocalDate.now(), name="alex")
}




