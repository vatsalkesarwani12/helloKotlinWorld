fun main(args: Array<String>) {
    println("Hello Kotlin")
    println("This is how to use the main argument, ${args[0]}")
    add(-1,8)      //function calling
}
fun add(a: Int ,b: Int)  //function in kotlin
{
    println("Adding $a and $b and we get ${a+b}")
}