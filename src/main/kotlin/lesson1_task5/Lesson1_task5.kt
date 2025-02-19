package org.example.lesson1_task5

const val SECONDS_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60

fun main() {
    val totalSeconds = 6480
    val hours = totalSeconds / (SECONDS_IN_MINUTE*MINUTE_IN_HOUR)
    val remainingMinutes = (totalSeconds % SECONDS_IN_MINUTE*MINUTE_IN_HOUR) / SECONDS_IN_MINUTE
    val formattedTime = String.format("%02d:%02d:%02d", hours, remainingMinutes, SECONDS_IN_MINUTE)

    println("Время, проведенное в космосе: $totalSeconds секунд")
    println("Время, проведенное в космосе: $formattedTime")
}