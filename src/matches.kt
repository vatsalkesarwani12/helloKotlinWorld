/*Chef's son Chefu found some matches in the kitchen and he immediately starting playing with them.
The first thing Chefu wanted to do was to calculate the result of his homework — the sum of A and B, and write it using matches. Help Chefu and tell him the number of matches needed to write the result.
*/

import java.util.*;
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
while(t>0){
val a=sc.nextInt()
val b=sc.nextInt()
var c=a+b
var sum=0
while(c!=0){
var d=c.mod(10)
when(d){
0 -> sum+=6
1 -> sum+=2
2 -> sum+=5
3 -> sum+=5
4 -> sum+=4
5 -> sum+=5
6 -> sum+=6
7 -> sum+=3
8 -> sum+=7
9 -> sum+=6
}
c/=10
}
println(sum)
t--
}
}