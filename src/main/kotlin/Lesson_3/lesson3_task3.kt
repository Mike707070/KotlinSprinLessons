package org.example.Lesson_3


fun main() {


        val number = 6


        println((1..9).joinToString("\n") { "$number x $it = ${number * it}" })


}