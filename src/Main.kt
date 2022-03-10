fun main(){
printString()
    modulus(20,11)
    myself("Shirleen",20)
    stringLength()
}

fun printString(){
    var name="codehive"
    var display=name[4].toString()+name[5]+name[6]+name[7]
    println(display)

}

fun modulus(num1:Int,num2:Int){
    var remainder=num1%num2
    println(remainder)
}


fun myself(name:String,age:Int){
    var message="Hi my I am $name and I am $age years old."
    println(message)
}

fun stringLength(){
    var name="Susan"
    println(name.length)
}