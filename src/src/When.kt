fun main(args:Array<String>){
    var x:Int
    var y:Int?
    print("enter value:")
    x = readLine()!!.toInt()
    println("enter value:")
    y = readLine()!!.toInt()

    var max = if(x>y) x else y
    println("max is $max")
    when(x){
        1,2 ->{
            print("value is 1 or 2")
        }
        in 3..10 ->{
            print("value is between 3 to 10")
        }
        !in 11.. 20 ->{
            print("value is greater than 20")
        }
        else ->{
            print("value is between 11 to 20")
        }
    }
}