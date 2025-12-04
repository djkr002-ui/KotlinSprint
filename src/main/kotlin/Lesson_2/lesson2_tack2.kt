package org.example.Lesson_2

fun main() {
    val regularEmployeesCount = 50
    val regularSalary = 30000
    val internsCount = 30
    val internSalary = 20000

    val regularSalaryExpenses = regularEmployeesCount * regularSalary

    val totalSalaryExpenses = regularSalaryExpenses + (internsCount * internSalary)

    val totalEmployees = regularEmployeesCount + internsCount
    val averageSalary = totalSalaryExpenses / totalEmployees

    println(regularSalaryExpenses)
    println(totalSalaryExpenses)
    println(averageSalary)
}