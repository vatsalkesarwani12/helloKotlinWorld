/*Chef has recently been playing a lot of chess in preparation for the ICCT (International Chef Chess Tournament).

Since putting in long hours is not an easy task, Chef's mind wanders elsewhere. He starts counting the number of squares with odd side length on his chessboard..

However, Chef is not satisfied. He wants to know the number of squares of odd side length on a generic N∗N chessboard.*/

import java.util.*;
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
while(t>0)
{
var n= sc.nextInt()
var sum=0
for(i in n downTo 0 step 2){
sum+=i*i
}
println(sum)
t--
}
}