/*Write a program to obtain a number N and increment its value by 1 if the number is divisible by 4 otherwise decrement its value by 1.*/

import java.util.*;
fun main(args :Array<String>){
val sc = Scanner(System.`in`)
var a=sc.nextInt()
if(a%4 ==0)
println(++a)
else println(--a)
}