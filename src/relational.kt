/*
 Chef has just started Programming, he is in first year of Engineering. Chef is reading about Relational Operators.
Relational Operators are operators which check relatioship between two values. Given two numerical values A and B you need to help chef in finding the relationship between them that is,
First one is greater than second or,
First one is less than second or,
First and second one are equal.
 */
import java.util.*
fun main(args :Array<String>) {
    val sc=Scanner(System.`in`)
    var t=sc.nextInt()
    while(t>0){
        val a=sc.nextInt()
        val b=sc.nextInt()
        if(a>b){
            println('>')
        }
        else if(a<b){
            println('<')
        }
        else println('=')
        t--
    }
}