package org.example.Lesson_4

fun main() {
    val sunnyWeather: Boolean = true
    val awning: Boolean = true
    val airHumidity: Int = 20
    val season: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunnyWeather == true && awning == true && airHumidity == 20 && season != "Зима"}")
}