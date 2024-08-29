package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    exploreFilter(courseList)
}

fun exploreFilter(courseList: MutableList<Course>) {

    val devCourse = courseList
        /*

            public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
                return filterTo(ArrayList<T>(), predicate)
            }
         */
        .filter {
            /*
            what is it? keyword in kotlin that gives you the access to the element its currently working on
             */
            it.category == CourseCategory.DEVELOPEMENT
        }.forEach {
            println("DevCourses: $it")
        }


}
