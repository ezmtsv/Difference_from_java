package ru.netology

fun main() {
    //var amount: Int
    val rate = 0.0075f
    val min = 35
    var amount = ""
    println("Введите сумму перевода:")
    amount = readLine().toString()
    val tax = rate * amount.toFloat()
    val result = if (tax < min) min else tax
    println("комиссия составит = $result руб.")
}