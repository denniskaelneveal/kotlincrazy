import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter firt number number: ")
    var num1 = read.nextDouble()

    println("Enter second number number: ")
    var num2 = read.nextDouble()

    println("Enter third number number: ")
    var num3 = read.nextDouble()

    if ( num1 > num2 && num1 > num3){
        println("$num1 is the largest number")

    }
    else if (num2 > num1 && num2 > num3){
        println("$num2 is the largest number")
    }
    else{
        println("$num3 is the largest number")
    }
}