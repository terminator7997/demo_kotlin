import java.util.*

fun main(args:Array<String>){
    println("Enter DOB: ")
    var DOB:Int = readLine()!!.toInt()

    var Yea = Calendar.getInstance().get(Calendar.YEAR)
    println("YEAR is $Yea")
    var Age = Yea - DOB
    println("Your Age is $Age")
}