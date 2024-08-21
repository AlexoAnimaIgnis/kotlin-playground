package com.kotlinplayground.classes

data class Employee(
    val id: Int,
    val name: String,
)

fun main() {
    val employee = Employee(1, "Alexo")
    println(employee)


    val employee2 = Employee(1, "Alexo")
    println("Comparing employees: ${employee == employee2}")


    val employee3 = employee.copy(id = 2, "Alexo2")
    print(employee3)
}