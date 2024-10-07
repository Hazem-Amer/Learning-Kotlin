package com.example.firstkotlinapp

import java.lang.IllegalArgumentException

//problem:
interface Expr
class Num(val num: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int = when {
    e is Num -> e.num
    e is Sum -> eval(e.left) + eval(e.right)
    //here we need to specify our custom exception or we gonna get runtime error
    else -> throw IllegalArgumentException("Unknown Expression")
}

//Solution:
sealed interface Expr1
class Num1(val num: Int) : Expr1
class Sum1(val left: Expr, val right: Expr) : Expr1

fun eval1(e: Expr1): Int = when (e) {
    is Num1 -> e.num
    is Sum1 -> eval(e.left) + eval(e.right)
    /**here we don't need to specify our custom exception
    as the sealed class identify the class hierarchy in compile
    time so it knows all the children of the parent **/
}

fun main() {
    val e:Expr = Num(2)
    println( eval(e))

    val e1:Expr1 = Num1(2)
    println(eval1(e1))
}
