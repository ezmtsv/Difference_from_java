package ru.netology

fun main() {
    while (true) {
        println("""Введите количество лайков или "end" для выхода из программы и нажмите enter""")
        val likes = readLine()
        if (likes != null) {
            if (likes == "end") break
            showMessage(likes);
            println()
        }
    }
}

fun showMessage(like: String) {
    val lastDigit = like.toInt() % 10
    val preLastDigit = (like.toInt() / 10) % 10
    when(lastDigit) {
        1 -> {
            if (preLastDigit == 1) println("Понравилось $like людям")
            else println("Понравилось $like человеку")
        }
        else -> println("Понравилось $like людям")
    }
}
