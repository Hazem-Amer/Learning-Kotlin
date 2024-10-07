package com.example.firstkotlinapp

class Example {
    val lazyValue: String by lazy {
        println("doing heavy operation to compute...")
        "Lazy value intialized"
    }
    lateinit var lateInitValue: String
    fun initialize() {
        lateInitValue = "Late Value initialized"
    }
}

fun main() {
    val example = Example()
    example.lazyValue

//    example.lateInitValue  //here we gonna get UninitializedPropertyAccessException
   example.initialize()
    println(example.lateInitValue)
}