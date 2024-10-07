package com.example.firstkotlinapp

fun main() {
//    val point1 = Point(1, 2)
//    val point2 = Point(3, 4)
//    val result = point1 + point2
//    println(result)

    //example on using val is better than var
//    val list1 = mutableListOf(1,2,3)
//    val list2 = list1
//    list1 +=4
//    println("list1 : $list1 \n list2: $list2 ${list1 === list2}")
//
}

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
}

operator fun Int.rangeTo(end:Int){

}
