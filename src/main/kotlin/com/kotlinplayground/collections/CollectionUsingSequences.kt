package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

/**
 * sequences perform better on big data
 */
fun main() {

    val namesListUsingSequence = listOf("alex", "arthur", "chloe")
        .asSequence() //alternative api to work with collections, evaluated lazily
        .filter { it.length >= 4} // alex
        .map { it.uppercase() } //
        .toList() // terminal operator

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    println("namesListUsingSequence : $namesListUsingSequence")
    exploreFilterUsingSequence(
        courseList(),
        devPredicate
    )

    val range = 1 .. 1000_000_000
    range
        .asSequence()
        .map { it.toDouble() }
        .take(40)
        .forEach{
            println("value is : $it")
        }
}


fun exploreFilterUsingSequence(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        .asSequence()
        .filter {
            /*
            what is it? keyword in kotlin that gives you the access to the element its currently working on
             */
            predicate.invoke(it)
        }.forEach {
            println("Courses: $it")
        }


}