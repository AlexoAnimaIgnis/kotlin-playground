package com.kotlinplayground.classes

import java.lang.IllegalArgumentException

class Item() {
    var name: String = ""
    var price: Double = 0.0
        // getter
        get() {
            println("inside getter")
            return field
        }
        // setter
        set(value) {
            // setup validation
            println("inside setter")
            if(value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("Negative Price is not allowed")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")
    item.price = 10.0
    println(item.price)
}