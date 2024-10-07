package com.example.firstkotlinapp

open class Animal(name: String, internal open val age: Int){
    internal open var name: String = name
        get() = "From parent name is: $field}"
    open fun makeSound() = println("Animal Sound")
    open fun eat() = println("Animal is eating...")
}

internal class Dog(override var name:String, age: Int):Animal(name,age){
    override fun makeSound()  = println("${this.name} is making WOOF WOOF...")
    fun smellingDangerous() = println("from child smelling...")
}

class Cat(override var name:String, age: Int):Animal(name,age){
    override fun makeSound()  = println("${this.name} is making MEOW MEOW...")
    fun cuddling() = println("from child Cuddling...")
}