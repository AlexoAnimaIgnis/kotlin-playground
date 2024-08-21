package com.kotlinplayground.interfaces

import com.kotlinplayground.classes.Course

interface CourseRepository {

    fun getById(id: Int): Course
    fun save(course: Course):Int
}

class SqlCourseRepository : CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "Reactive", "alexo")
    }

    override fun save(course: Course): Int {
        println("Course: ${course.id}")
        return course.id
    }
}

class NoSqlCourseRepository : CourseRepository {

    override fun getById(id: Int): Course {
        return Course(id, "NoSqL", "alexo")
    }

    override fun save(course: Course): Int {
        println("NoSQl Course: ${course.id}")
        return course.id
    }
}

fun main() {
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println(course)

    val courseId = sqlCourseRepository.save(course)
    println("courseId: $courseId")


    val noSqlCourseRepository = NoSqlCourseRepository()
    val course1 = noSqlCourseRepository.getById(1)
    println(course1)
    val courseId2 = noSqlCourseRepository.save(course1)
    println("courseId: $courseId2")
}