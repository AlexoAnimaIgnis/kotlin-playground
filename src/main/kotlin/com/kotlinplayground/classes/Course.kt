package com.kotlinplayground.classes

data class Course(
    val id: Int,
    val name: String,
    val author: String,
)

fun main() {
    val course1 = Course(1, "React", "alexo")
    val course2 = Course(1, "React", "alexo")

    println("Checking object equality: ${course1 == course2}")

    val course3 = course1.copy(
        id=3, author="alexo2"
    ) // cloning object and return new instance
    println(course3)
}