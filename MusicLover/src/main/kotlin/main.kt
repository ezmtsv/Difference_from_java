package ru.netology

fun main() {
    val allUsers: Array<String> = arrayOf("Иван", "Таня", "Света", "Игорь", "Миша", "Оля", "Костя", "Вадим", "Лена")
    val markerVip: Array<Boolean> = arrayOf(true, false, true, true, false, false, true, true, false)
    val sum: Array<Int> = arrayOf(1000, 1000, 20_000, 10_000, 30_000, 15_000, 5000, 50_000, 70_000)
    var i = 0
    for (name in allUsers) {
        var discount = 0
        var pay:Int = 0
        if (sum[i] <= 1000) {
            pay = if (markerVip[i]) (sum[i].toDouble() * 0.99).toInt()
            else sum[i]
            discount = sum[i] - pay
         } else if (sum[i] <= 10000) {
            pay = sum[i] - 100
            if (markerVip[i]) pay = (pay.toDouble() * 0.99).toInt()
            discount = sum[i] - pay
        } else {
            pay = (sum[i].toDouble() * 0.95).toInt()
            if (markerVip[i]) pay = (pay.toDouble() * 0.99).toInt()
            discount = sum[i] - pay
        }
        println("Сумма покупки клиента $name ${sum[i]}, скидка $discount руб, итоговая сумма $pay")
        i++
    }
}