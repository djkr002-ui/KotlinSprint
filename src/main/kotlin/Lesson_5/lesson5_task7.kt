package org.example.Lesson_5

const val SCALING_FACTOR = 100

fun main() {

    println("Ведите расстояние поездки в километрах:")
    val travelDistance = readln().replace(',', '.').toDouble()

    println("Ведите расход топлива на 100 км в литрах:")
    val fuelConsumption = readln().replace(',', '.').toDouble()

    println("Ведите текущую цену за литр топлива в руб/л:")
    val currentPriceLiterFuel = readln().replace(',', '.').toDouble()

    //общее количество литров топлива
    val totalAmountFuel = (travelDistance * fuelConsumption) / SCALING_FACTOR

    //общую стоимость топлива
    val totalCostFuel = totalAmountFuel * currentPriceLiterFuel

    println("Общее количество необходимого топлива: ${"%.2f".format(totalAmountFuel)} л.")
    println(String.format("Итоговая стоимость поездки: %.2f руб", totalCostFuel))
}