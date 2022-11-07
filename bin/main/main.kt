package ru.netology

fun main() {
    val itemPtice = 100
    val itemCount = 100
    val regularUser = true
    val discount = 100
    val discountFive = 0.95
    val discountRegularUser = 0.99
    val discountStart = 1_000
    val discountFiveStart = 10_000

    val totalPrice = itemPtice * itemCount
    val result = if (totalPrice > discountStart && totalPrice < discountFiveStart) totalPrice - discount else
        if (totalPrice >= discountFiveStart) totalPrice * discountFive else totalPrice

    val finalResult = if (regularUser) result.toDouble() * discountRegularUser else result
    val discountSumm = totalPrice - finalResult.toDouble()

    println("Стоимость Вашего заказа составит $finalResult, сумма Вашей скидки: $discountSumm")
}