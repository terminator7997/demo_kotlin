fun main(args:Array<String>){
    var List = ArrayList<String>()
    List.add("abcc")
    List.add("cdd")
    List.add("eff")
    List.add("gff")
    println("3rd element is : "+List.get(2))

    for (elemeent in List) {
        println(elemeent)
    }
    List.set(0,"hello")
    println("0th element is : ${List.get(0)}")

    //search
    if(List.contains("eff")){
        println("found")
    }
    else{
        print("not found")
    }
}