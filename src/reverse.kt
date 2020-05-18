/*If an Integer N, write a program to reverse the given number*/

import java.util.*
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
while(t>0){
var n=sc.nextInt()
var rev=0
while(n>0){
rev=rev*10+n%10
n/=10
}
println(rev)
t--
}
}