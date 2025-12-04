package org.example.Lesson_2

fun main() {
    val student = 4
    val studentAssessment1 = 3
    val studentAssessment2 = 4
    val studentAssessment3 = 3
    val studentAssessment4 = 5

    val sumOfRatings = studentAssessment1 + studentAssessment2 + studentAssessment3 + studentAssessment4
    val averageScore = sumOfRatings / student.toDouble()

    println(averageScore)
}