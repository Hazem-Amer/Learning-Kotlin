package com.example.firstkotlinapp

import kotlin.random.Random

fun main(){
    val number = 45
   println( number.takeIf { Random.nextBoolean() }?.let {num->
       num.inc()
   })
}