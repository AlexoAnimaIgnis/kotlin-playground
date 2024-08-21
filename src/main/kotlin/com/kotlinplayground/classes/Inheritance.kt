package com.kotlinplayground.classes

/**
 * - inheritance is only allowed if there is "open" keyword
 * - inheritance allows only one parent
 */
open class User(val name: String) {

    open var isLoggedIn : Boolean = false

    // initially 'login' in 'User' is final and cannot be overridden. add open to avoid issue
    open fun login() {
        println("Inside user login")
    }

    private fun secret() {
        println("secret")
    }

    protected open fun logout() {

    }

}

class Student(name: String): User(name) {
    override var isLoggedIn : Boolean = false

    companion object {
        const val numberOfEnrolledCourses = 10
        fun country() = "USA"
    }
    override fun login(){
        println("Inside student login")
        super.login()
    }

    override fun logout() {
        println("inside student lougout")
    }
}
class Instructor(name:String): User(name)

fun main() {
    val student = Student("Alexo")
    println("name is: ${student.name}")
    student.login()
    student.isLoggedIn = true
    val country = Student.country()
    println("Country is $country")
    println("Enrolled courses is ${Student.numberOfEnrolledCourses}")


    val instructor = Instructor("Instructor")
    println("name is: ${instructor.name}")
    instructor.login()

    val alex = User("alexo")
}