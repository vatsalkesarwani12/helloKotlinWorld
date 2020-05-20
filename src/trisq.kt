/*What is the maximum number of squares of size 2x2 that can be fit in a right angled isosceles triangle of base B.
One side of the square must be parallel to the base of the isosceles triangle.
Base is the shortest side of the triangle*/

import java.util.*
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
while(t>0){
var n=sc.nextInt()
var z=n/2
println(z*(z-1)/2)
t--
}
}