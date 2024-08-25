package com.example.myapplication

fun main(){
    val mes = 5

    return when(mes){
        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo Trimestre")
        7,8,9 -> println("Tercer Trimestre")
        10,11,12 -> println("Cuarto Trimestre")
        else -> println("Rango Invalido")

    }
}