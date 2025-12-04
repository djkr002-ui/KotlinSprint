package org.example.Lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11

    val buffPercent = 20

    val bonusCrystalOre = (crystalOre * buffPercent) / 100
    val bonusIronOre = (ironOre * buffPercent) / 100

    println("Bonus Crystal Ore: $bonusCrystalOre")
    println("Bonus Iron Ore: $bonusIronOre")
}