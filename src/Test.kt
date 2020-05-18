/*Your program is to use the brute-force approach in order to find the Answer to Life, the Universe, and Everything. More precisely... rewrite small numbers from input to output. Stop processing input after reading in the number 42. All numbers at input are integers of one or two digits.*/

import java.util.*;
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
while(true){
val t=sc.nextInt()
if(t==42)
break;
println(t)
}
}