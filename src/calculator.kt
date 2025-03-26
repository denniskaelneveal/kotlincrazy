import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number: ")
    var num1 = read.nextDouble()

    println("Enter operator: ")
    var operator = readln()

    println("Enter Second number: ")
    var num2 = read.nextDouble()

    var answer = when(operator){
        "+" ->num1+num2
        "-" ->num1-num2
        "*" ->num1*num2
        "/" ->num1/num2
        else ->"invalid operation"
    }
    println("$num1 $operator $num2 = $answer")

}