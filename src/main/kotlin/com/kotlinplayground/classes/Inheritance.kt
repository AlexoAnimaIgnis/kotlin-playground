package com.kotlinplayground.classes

// inheritance is only allowed if there is "open" keyword
// inheritance allows only one parent
open class User(val name: String) {

    fun login() {
        println("Inside user login")
    }

}

class Student(name: String): User(name)
class Instructor(name:String): User(name)

fun main() {
    val student = Student("Alexo")
    println("name is: ${student.name}")
    student.login()


    val instructor = Instructor("Instructor")
    println("name is: ${instructor.name}")
    instructor.login()
}