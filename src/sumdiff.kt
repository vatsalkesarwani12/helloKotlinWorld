/*Write a program to take two numbers as input and print their difference if the first number is greater than the second number otherwise print their sum.*/

import java.util.*;
fun main (args: Array<String>)
{
val sc=Scanner(System.`in`)
val a=sc.nextInt()
val b=sc.nextInt()
if (a > b)
{
println(a-b)
}
else println(a+b)
}