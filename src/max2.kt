/*Given a binary number (of N bits) X. Find the highest power of 2 that divides this number.

Note: If the binary number is "100" then the highest power of 2 that divides it is 2 (as 22 = 4)*/

import java.util.*
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var n=sc.nextInt()
var s=sc.nextLine()
s=sc.nextLine()
val l=s.lastIndexOf('1')
println(n-1-l)
}