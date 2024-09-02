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
    exploreApply()
    exploreAlso()
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