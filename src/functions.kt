fun main() {
    //standard library functions/predefined functions
    var output = Math.sqrt(81.0)
    println("The squareroot of 81.0 is $output")

    var roundedvalue = Math.round(34.78)
    println(roundedvalue)

    name() //make sure to call a function
    add()
    employee("john",90000,false)
    employee("Dennis",90000,false)
    student("Brian",23,"softwareengineering")

}
//user defined functions
fun name(){
    println("Dennis")
}
fun add(){
    var x = 20
    var y =30
    println(x + y)
}
//parameter and argument
fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is earning $salary.Disability : $disability")
}
fun student(name:String,age:Int,course:String){
    println("$name is $age years old." +
            "he is studying $course")


}













