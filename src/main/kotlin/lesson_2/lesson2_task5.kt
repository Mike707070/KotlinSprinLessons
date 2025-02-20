package lesson_2

fun main() {

//    A = P × (1 + r/n)ⁿᵗ

    val initialCapital = 70000.00 //начальный капитал
    val annualRateInterest = 16.7f //годовая процентная ставка
    val accrualsPerYear = 1.0    // Количество начислений процентов в год (например, ежемесячно)
    val depositYears = 20.0     // Количество лет

    val finalDeposit: Double =
        initialCapital * Math.pow(1 + (annualRateInterest / 100) / accrualsPerYear, (accrualsPerYear * depositYears))

    println("размер вклада - ${"%.3f".format(finalDeposit)}")


}