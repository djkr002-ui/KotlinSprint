package org.example.Lesson_2

const val BASIS_PERCENTAGE_CALCULATION = 100

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val buffPercent = 20

    val bonusCrystalOre = (crystalOre * buffPercent) / BASIS_PERCENTAGE_CALCULATION
    val bonusIronOre = (ironOre * buffPercent) / BASIS_PERCENTAGE_CALCULATION

    println("Bonus Crystal Ore: $bonusCrystalOre")
    println("Bonus Iron Ore: $bonusIronOre")
}