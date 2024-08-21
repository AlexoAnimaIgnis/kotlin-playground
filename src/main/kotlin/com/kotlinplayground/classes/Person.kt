package com.kotlinplayground.classes

class Person(
    val name: String = "",
    val age: Int = 0
) {
    var email: String = ""
    var nameLength: Int = 0
    init {
        println("value inside init block")
        nameLength = name.length
    }

    constructor(_email: String,
                _name: String = "",
                _age: Int = 0
    ): this(_name, _age) {
        email = _email
    }

    fun action() {
        println("Person walks")
    }
}

fun main() {
//    val person = Person("Alexo", 25) // no need to create an object using new keyword
//    person.action()
//    println("Name ${person.name} and the age is ${person.age}")
//
//    val person2 = Person()
//    println("Name ${person2.name} and the age is ${person2.age}")

    val person3 = Person(_email = "abc@gmail.com", _name = "Alexo", _age = 25)

    println("Name ${person3.name} and the age is ${person3.age} and the email is ${person3.email} and nameLength is ${person3.nameLength}")
}