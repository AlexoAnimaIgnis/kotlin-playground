package com.kotlinplayground.scopes

import com.kotlinplayground.classes.Course
import com.kotlinplayground.dataset.CourseCategory

fun main() {
    /**
     * scope functions are tied to the context of an object.
     * sole purpose of the scope function is to execute a block of
     * code within the conetxt of an object.
     * - let
     * - run
     * - with
     * - apply
     * - also
     */
    //exploreApply()
    //exploreAlso()
    //exploreLet()
    exploreWith()
}

fun exploreWith() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    val result = with(numbers) {
        println("size is $size")
        sum()
    }
    println(result)
}

fun exploreLet() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    // common concept
    val res = numbers.map { it * 2 }.filter { it > 5 }
        .let {
            println(it)
            it.sum()
        }
    println("result is $res")

    var name: String? = null
    name = "alexo"
    val result1 = name?.let {
        println(it)
        it.uppercase()
    }

    println("result is $result1")
}

fun exploreApply() {
    val course = Course(
        1,
        "Design Thinking",
        "Alexo"
    ).apply {
        this.courseCategory = CourseCategory.DESIGN
    }

    println("course : $course")
}

fun exploreAlso() {
    val course = Course(
        1,
        "Design Thinking",
        "Alexo"
    ).also {
        // recommend to use as an after effect
        println("course : $it")
    }

}