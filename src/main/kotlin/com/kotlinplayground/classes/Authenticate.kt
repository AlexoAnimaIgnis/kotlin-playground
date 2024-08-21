package com.kotlinplayground.classes

/**
 * object keyword
 * - lets us allow to create a class and instance at the same time, similar to a singleton in java
 *
 * Kotlin doesnt have support for static keyword
 * companion object can be used to introduced static functionalities that are tied to the class
 * - using object inside the class requires you to use the companion keyword
 * - can contain variables and functions
 */
object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("username is $userName ")
    }
}

fun main() {
    Authenticate.authenticate("alexo","alexo")
}