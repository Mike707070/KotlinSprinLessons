package org.example.lesson_2

import java.time.LocalTime

fun main() {

    val departureTime = LocalTime.of(9, 39)
    val travelTime: Long = 457
    val arrivalTime = departureTime.plusMinutes(travelTime)

    println("Время прибытия")
    println(arrivalTime)

}