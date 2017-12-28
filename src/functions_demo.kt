fun main(args:Array<String>){

    val a = readLine()!!.toInt()

    val b = readLine()!!.toInt()
    val q = Ad(a,b)
    print("answer is $q")
}
fun Ad(a:Int,b:Int):Int {

    val sum = a + b
    return sum

}