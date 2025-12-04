package org.example.Lesson_2

fun main() {
    val studentsCount = 4
    val studentAssessment1 = 3
    val studentAssessment2 = 4
    val studentAssessment3 = 3
    val studentAssessment4 = 5

    val sumOfRatings = studentAssessment1 + studentAssessment2 + studentAssessment3 + studentAssessment4
    val averageScore = sumOfRatings / studentsCount.toDouble()

    println(String.format("%02d", averageScore))
}