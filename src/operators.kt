fun main(){

    //Arithmetic operators
    var x = 20
    var y = 5
    println(x+y)
    println(x*y)
    println(x/y)
    println(x-y)
    println(x%y)//Modulus

    //Comparison operators
    var a = 67
    var b = 30
    println(a < b)
    println(a > b)
    println(a <= b)
    println(a >= b)
    println(a == b)
    println(a != b)

    //Assignment Operators

    var number = 90
    println(number)
     number += 3
    println(number)


    //logical Operators - (and : &&) (or:||) (not:!)
    var num = 10
    println(num>67 && num<20) //true when the two conditions are tru
    println(num>67 || num<20) //true when one condition or both are true
    println(!(num>67 || num<20)) //reverses the condition



}