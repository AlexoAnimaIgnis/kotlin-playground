package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    exploreFilter(courseList, designPredicate)
}

fun exploreFilter(
    courseList: MutableList<Course>,
    predicate: (Course) -> Boolean
) {

    courseList
        /*

            public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
                return filterTo(ArrayList<T>(), predicate)
            }
         */
        .filter {
            /*
            what is it? keyword in kotlin that gives you the access to the element its currently working on
             */
            predicate.invoke(it)
        }.forEach {
            println("Courses: $it")
        }


}
