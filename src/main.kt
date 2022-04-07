fun main(){
oddNums()
    println(identity(arrayOf("patience","pascaline","speria","lucky")))
    robots(4)
    robots(7)
    robots(18)
    robots(30)
    figures()
}
fun oddNums(){
    for (num in 1..100)
        if(num% 2!=0){
            println(num)
        }
}
fun identity(names:Array<String>):Int{
    var x=0
    names.forEach{ d->
        if (d.length>5)
            x++
    }
      return  x
}
fun robots(age:Int){
    if (age<6){
        println("A bottle of fanta")
    }
    else if (age>=6 && age<15){
        println("A bottle of coco cola")
    }
}
fun figures(){
    for( f in 1..100)
        if (f % 3 ==0 && f%5==0){
            println("Fizz Buzz")
        }else if (f% 3==0){
            println("Fizz")
        }else {
            if (f% 5 ==0)
                println("Buzz")
        }
}
