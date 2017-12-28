fun main(args:Array<String>){
    //arrayInt of size 5 and assign every elements as 0
    var arrayInt = Array<Int>(5){0}
    for(element in 0..4){
        arrayInt[element] = readLine()!!.toInt()
    }
    println("values are")
    for(element in arrayInt){
        println(element)
    }
}