package org.example.Lesson_4

const val SHIP_DAMAGE = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val PROVISIONS = 50
const val WEATHER = true

fun main() {
    val presenceDamageHousing = readln().toBoolean()
    val currentCrewComposition = readln().toInt()
    val numberFoodCratesBoard = readln().toInt()
    val favorableWeatherCondition = readln().toBoolean()

    if (
        (presenceDamageHousing != SHIP_DAMAGE &&
                currentCrewComposition in MIN_CREW..MAX_CREW &&
                numberFoodCratesBoard > PROVISIONS) ||
        (currentCrewComposition == MAX_CREW &&
                favorableWeatherCondition == WEATHER &&
                numberFoodCratesBoard >= PROVISIONS)
    ) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}