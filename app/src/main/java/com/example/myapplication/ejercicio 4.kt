package com.example.myapplication

fun main() {
    val edad = 23
    val monday = true

    println("Su entrada vale: ${verificar(edad, monday)}")
}

fun verificar(age: Int, isMonday: Boolean): Int {
    return when (age) {
        in 1..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}
