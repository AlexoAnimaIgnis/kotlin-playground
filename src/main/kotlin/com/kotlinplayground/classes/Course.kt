package com.kotlinplayground.classes

import com.kotlinplayground.dataset.CourseCategory

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var courseCategory: CourseCategory = CourseCategory.DEVELOPEMENT
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