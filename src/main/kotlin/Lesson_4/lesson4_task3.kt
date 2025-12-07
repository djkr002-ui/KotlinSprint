package org.example.Lesson_4

const val AVAILABILITY_OF_SUNNY_WEATHER = true
const val OPEN_TENT = true
const val AIR_HUMIDITY = 20
const val SEASON = "Зима"

fun main() {
    val sunnyWeather: Boolean = true
    val awning: Boolean = true
    val airHumidityNow: Int = 20
    val seasonNow: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunnyWeather == AVAILABILITY_OF_SUNNY_WEATHER && awning == OPEN_TENT && airHumidityNow == AIR_HUMIDITY && seasonNow != SEASON}")
}