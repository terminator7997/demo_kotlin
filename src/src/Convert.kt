fun main(args:Array<String>){
    var Str:String = "12"
    var In:Int = 12
    var Fl:Double=12.2
    var abc:Int?
    //convert String Str to int
    abc = Str.toInt()
    println("abc = "+abc)
    //convert int In to
    Fl = In.toDouble()
    println("FL = "+Fl)
    Str = Fl.toString()
    println("Str = $Str")
}