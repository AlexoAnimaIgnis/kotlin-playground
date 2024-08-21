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

/**
 * handling multiple interface
 *
 */
interface A {
    fun doSomething() {
        println("Do something in A")
    }
}

interface B {
    fun doSomething() {
        println("Do something in B")
    }
}

class AB: A,B {
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
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

    val ab = AB()
    ab.doSomething()
}