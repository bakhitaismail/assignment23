fun main() {
    var string = "Akirachix"
    var x = string[0].toString()+string[2]+string[3]
    println(x)
    var name = "Bakhita"
    var age = 23
    println("My name is " + name + " and I am " + age + " years old.")
    var b = cars("Maserati", 65)
    println(b)
    var name1 = "Ismail"
    var name2 = "Trevor"
    if (name1==name2)
        println("That's me!")
    else(
            println("I don't know who that is."))


}
fun parameter(name: String, age: Int): String {
    var link = name.toString() +age
    return link

}
fun cars(name: String, lenth: Int): Int {
    var b = "Maserati"
    var c = b.length
    return c

}
fun myName() {

}





