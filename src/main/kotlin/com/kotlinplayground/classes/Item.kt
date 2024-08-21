package com.kotlinplayground.classes

class Item() {
    var name : String = ""

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("iphone")
    println("Item name is ${item.name}")
    item.name = "Iphone 13"
    println("Item name is ${item.name}")
}