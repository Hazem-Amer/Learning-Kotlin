package com.example.firstkotlinapp

abstract class Car {
    open fun moveUp(){
        println("From Class Car")
    }
    open fun startEngine() = println("Engine Started")
    open val model: String = "Car"
}

class Honda() : Car() ,Movable{
    override fun moveUp() {
        super<Movable>.moveUp()
    }
    override val model: String = super.model
    override fun startEngine() = println("Honda Engine starting...")
}

class Plane():Movable{
    override fun moveUp() {
        super.moveUp()
    }
}
interface  Movable{
    fun moveUp(){
        println("Moving Up...")
    }
}

fun main() {
    val movable = getMovable(true)
    if( movable is Honda)
        movable.moveUp()
    if(movable is Plane) {
        movable.moveUp()
    }
}


fun getMovable(isMovable:Boolean) = if(isMovable) Honda() else Plane()