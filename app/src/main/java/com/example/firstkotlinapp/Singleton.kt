package com.example.firstkotlinapp

object DbHandler {
    fun createDb(name: String, version: Float): MyDataBase {
        println("DB CREATED...")
        return MyDataBase(name, version)
    }


}

interface MyDb {
    fun addStudent(name:String)
}

class MyDataBase(var name: String, var version: Float) : MyDb {
    override fun addStudent(name:String) = println("$name has been Added")
}


fun main() {
    val db: MyDataBase = DbHandler.createDb("Student", 1.0f)
    db.addStudent("Hazem")
}
