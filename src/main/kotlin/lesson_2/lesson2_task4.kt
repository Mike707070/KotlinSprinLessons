package org.example.lesson_2

fun main() {

    val buffPercent: Double = 20.0 / 100
    val crystallineOre: Int = 7
    val ironOre: Int = 11

    println("бонус кристаллической руды - ${(crystallineOre * buffPercent).toInt()}")
    println("бонус железной руды - ${(ironOre * buffPercent).toInt()}")


}