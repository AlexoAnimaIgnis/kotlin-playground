package com.kotlinplayground.collections

fun main() {

    val names = listOf("Alex", "Ben", "Chloe")
    println("names: $names")
//    names.add - add method is not available since names is an immutable collection

    val namesMutableList = mutableListOf("alex", "ben", "chloe")
    println("names in mutable list: $namesMutableList")
    namesMutableList.add("adam")
    println("names in mutable list: $namesMutableList")

    val set = setOf("Alex", "Ben", "Chloe")
    println("set: $set")

    val mutableSet = mutableSetOf("alex", "ben", "chloe")
    println("mutableSet : $mutableSet")
    mutableSet.add("bad")
    println("adam")

    val nameAgeMap = mapOf("Dilip" to 34, "Scooby" to 4)
//    nameAgeMap.put

    println("nameAgeMap : $nameAgeMap")

    val nameAgeMutablemap = mutableMapOf("Dilip" to 34, "Scooby" to 4)

    println("nameAgeMutablemap : $nameAgeMutablemap")
//    nameAgeMutablemap.put("adam", 100)
    nameAgeMutablemap["adam"] = 100
    println("nameAgeMutablemap : $nameAgeMutablemap")
}