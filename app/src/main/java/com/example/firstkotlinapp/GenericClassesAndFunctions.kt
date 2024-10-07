package com.example.firstkotlinapp


fun main(){
    //Generics
    val list:List<Int> = ArrayList<Int>()
    val intBox:Box<String> = Box("Case")
    val stringArray:Array<Int> = arrayOf(1,2,3)
    printArray(stringArray)

}

class Box<T>(var item:T)
fun <T> printArray(array:Array<T>){
    array.forEach {
        println(it)
    }
}