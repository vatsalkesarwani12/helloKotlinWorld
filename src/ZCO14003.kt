/*What is the maximum number of squares of size 2x2 that can be fit in a right angled isosceles triangle of base B.
One side of the square must be parallel to the base of the isosceles triangle.
Base is the shortest side of the triangle*/

import java.util.*
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
var n=t
var s=ArrayList<Int>()
while(t>0){
s.add(sc.nextInt())
t--
}
s.sort()
var max=0
var i=0
for(i in 0 until n){
if(max<(s.get(i)*(n-i))){
max=s.get(i)*(n-i)
}
}
println(max)
}