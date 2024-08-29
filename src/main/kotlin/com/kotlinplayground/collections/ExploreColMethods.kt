package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    //exploreFilter(courseList, designPredicate)
    //exploreMap(courseList, designPredicate)

    val list = listOf(listOf(1,2,3), listOf(4,5,6))
    val mapList = list.map { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("MapResult: $mapList")

    val flatMapResult = list.flatMap { outerList ->
        outerList.map {
            it.toDouble()
        }
    }
    println("flatMapResult: $flatMapResult")
}

fun exploreFlatMap(courseList: List<List<Int>>) {

}

fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}"  }
        .forEach {
            println(it)
        } // foreach is a terminal operator
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
