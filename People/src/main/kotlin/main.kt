package ru.netology

fun main() {
    while (true) {
        val likes = readLine()
        if (likes != null) {
            if (likes == "end") break
            showMessage(likes);
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
