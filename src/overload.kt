fun main(args:Array<String>){
    println("enter number one")
    var a = readLine()!!.toInt()
    println("enter number two ")
    var b = readLine()!!.toInt()
    println("enter number three ")
    var c = readLine()!!.toInt()
    var one = two(a,b)
    println("addition of two number is : $one")
    one = two(a,b,c)
    println("addition of three number is : $one")

}
fun two(a:Int,b:Int):Int{
    return (a+b)
}
fun two(a:Int,b:Int,c:Int):Int{
    return (a+b+c)
}