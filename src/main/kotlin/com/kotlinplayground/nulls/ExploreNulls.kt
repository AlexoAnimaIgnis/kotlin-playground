package com.kotlinplayground.nulls

data class Movie(
    val id: Int?,
    val name: String
)

fun saveMovie(movie: Movie) : Movie{
    return movie.copy(id =1)
}


fun main() {
    var nameNullable : String? = null
    println("value is ${nameNullable?.length}") // ? - safe call operators , meaning execute only if the variable is not null
//    if (nameNullable != null) {
//        println("value is ${nameNullable.length}")
//    }

//    nameNullable = "Alexo"
    val length = nameNullable?.length ?: 0 //Elvis operator - provides a default value
    println("Length: $length")
    println("Value is: $nameNullable")

    var name: String = "Alexo"
    val movie = Movie(null, "Avengers")
    val savedMovie = saveMovie(movie)
    println("SavedMoview : $savedMovie")
}

