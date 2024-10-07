package com.example.firstkotlinapp

class A{
    val aValue:Int = 5
    fun newMthod() = println("From A: ${this.aValue}")
    class B{
        val bValue:Int = 5
    }
    inner class C{
        val cValue:Int = 5
        fun printOuter() = println("From A: ${this@A.aValue}\n From C: ${this.cValue}")
    }
}
