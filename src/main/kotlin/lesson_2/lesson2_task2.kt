package org.example.lesson_2

fun main() {

    val staff = 50
    val staffSalaries = 30000
    val intern = 30
    val internSalaries = 20000

    val sumStaffSalary: Int = staff * staffSalaries
    val sumInternSalary: Int = intern * internSalaries
    val salaryFund = sumStaffSalary + sumInternSalary
    val mediumSalary = salaryFund / (staff + intern)


    println(sumStaffSalary) //зарплата сотрудников
    println(sumInternSalary) //зарплата стажеров
    println(salaryFund) //ФОТ
    println(mediumSalary) //средняя зарплата

}