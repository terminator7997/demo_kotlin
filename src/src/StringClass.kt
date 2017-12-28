fun main(args:Array<String>){
    /*var Node = "This is a String"
    println("Node: $Node")
    Node = Node + " no. 2"
    println("Node : $Node")
    println("It's 1 and 2 char are : "+Node[0] +" "+Node[1])
    println("It's lower case is : "+Node.toUpperCase())*/

    //String array

    var arrayStr = Array<String>(3){""}
    for(index in 0..2){
        print("str[$index]: ")
        arrayStr[index] = readLine()!!
    }
    for (abc in arrayStr){
        print(abc+" ")
    }


}