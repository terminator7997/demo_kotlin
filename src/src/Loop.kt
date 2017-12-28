fun main(args:Array<String>){
    loop1@ for (i in 1..3){
        loop2@ for(k in 1..12) {
            println("value of k is $k")
            if(k==3){
               break@loop1
            }
        }
    }
    var j = 1
    while(j<=5){
        j++
    }
    println("final value of j is $j")
}
