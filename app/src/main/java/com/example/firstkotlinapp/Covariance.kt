package com.example.firstkotlinapp

open class Person()

class Student : Person()


class Consume<in T>(val name:String) {
//    fun produce():T? = null
    fun consume(item:T){

    }
    fun consumeUnique():String{
        return "Hello, $name"
    }
}

fun main() {
    var persons: List<Person> = mutableListOf()
    val students: List<Student> = mutableListOf()
    /** not allowed if persons was Mutable list,
     *  because in this case we 'd be able to add Person() in students list which is not allowed,
     *  so it should be immutable **/
    persons = students

//    val cons:Consume<String> = Consume()
    /**The same as before we cant make the parent be a reference for the child except
     *  for immutable types or we can disallow the consume methods (i.e: consAny.consume()) (read-only) using "out" keyword**/
//    val consAny:Consume<Any> = cons

    val cons:Consume<Any> = Consume("Hazem")
    val consAny:Consume<String> = cons
}