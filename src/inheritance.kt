//parent class/base
open class Animal{
    var age = 12
    var gender = "Male"

    fun makesound(){
        println("Animal is speaking")
    }
}
//child class/derived/sub
class dog:Animal(){
    fun bark(){
        println("Dog is woofing")

    }
}
class cat:Animal(){
    fun meow(){
        println("cat is meowing")
    }
}

fun main() {
    var a = Animal()
    var d = dog()
    d.makesound()
    d.bark()
    var c = cat()
}






