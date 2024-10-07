package com.example.firstkotlinapp

interface Describable {
    fun describe(): String
}

class MyClass private constructor(val name: String, val age: Int) {
    companion object Factory : Describable {
        var instanceCounter = 0
        init{
            println("Companion Object initialized")
        }
        val CLASS_LEVEL_CONST = "THIS IS CLASS LEVEL CONST"
        fun create(name: String, age: Int):MyClass {
            instanceCounter++
            return MyClass(name,age)
        }

        override fun describe(): String = "THIS IS C OBJECT FROM MY CLASS"

    }
}
fun MyClass.Factory.extensionFunctionForFactory():String = "THIS IS AN EXTENSION FUNC FROM COMPANION OBJECT"

fun main(){
    println(MyClass.CLASS_LEVEL_CONST)
    val obj1 = MyClass.create("Hazem",23)
    val obj2 = MyClass.create("Ziad",21)
    println(MyClass.instanceCounter)
    println(MyClass.describe())
    println(MyClass.extensionFunctionForFactory())

}