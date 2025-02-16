package org.example.lesson1_task5

fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / 3600
    val remainingMinutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, seconds)

    println("Время, проведенное в космосе: $totalSeconds секунд")
    println("Время, проведенное в космосе: $formattedTime")
}