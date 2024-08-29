package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()

    val devPredicate = { c: Course -> c.category == CourseCategory.DEVELOPEMENT }
    val designPredicate = { c: Course -> c.category == CourseCategory.DESIGN }

    //exploreFilter(courseList, designPredicate)
    //exploreMap(courseList, designPredicate)

//    val list = listOf(listOf(1,2,3), listOf(4,5,6))
//    val mapList = list.map { outerList ->
//        outerList.map {
//            it.toDouble()
//        }
//    }
//    println("MapResult: $mapList")
//
//    val flatMapResult = list.flatMap { outerList ->
//        outerList.map {
//            it.toDouble()
//        }
//    }
//    println("flatMapResult: $flatMapResult")
//
//    val courses = exploreFlatMap(courseList, KAFKA)
//    println("Courses: $courses")

    exploreHashMap()
}

fun exploreHashMap() {
    val nameAgeMutableMap = mutableMapOf("Alexo" to 33, "Scooby" to 34)
    nameAgeMutableMap
        .forEach { (t, u) ->
            println("Key : $t and the value is $u")
        }

    val value = nameAgeMutableMap.getOrDefault("Dilip1") { "abc" } // assign a default value if key is missing
    println("Value is $value")

    val ispresent = nameAgeMutableMap.containsKey("abc")
    println("isPresent : $ispresent")

    val filteredKeyMap = nameAgeMutableMap
        .filterKeys { it.length > 5 }
        .map { it.key.uppercase() }
    println("filteredMap: $filteredKeyMap")

    val highestAge = nameAgeMutableMap
        .maxByOrNull { it.value }

    println("Max age:  $highestAge")
}

fun exploreFlatMap(courseList: MutableList<Course>, kafka: String): List<String> {
    val kafkaCourses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter {
            it == kafka
        }.map {
            courseName
        }
    }

    return kafkaCourses
}


fun exploreMap(courseList: MutableList<Course>, predicate: (Course) -> Boolean) {
    val courses = courseList
        .filter(predicate)
        .map { "${it.name} - ${it.category}" }
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
