package com.example.myapplication

fun main(){
    val month= 5

    when(month){
        1 -> return println("January")
        2 -> return println("February")
        3 -> return println("March")
        4 -> return println("April")
        5 -> return println("may")
        6 -> return println("june")
        7 -> return println("july")
        8 -> return println("august")
        else -> println("invalid month")
    }
}

