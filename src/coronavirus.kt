/*There are N people on a street (numbered 1 through N). For simplicity, we'll view them as points on a line. For each valid i, the position of the i-th person is Xi.

It turns out that exactly one of these people is infected with the virus COVID-19, but we do not know which one. The virus will spread from an infected person to a non-infected person whenever the distance between them is at most 2. If we wait long enough, a specific set of people (depending on the person that was infected initially) will become infected; let's call the size of this set the final number of infected people.

Your task is to find the smallest and largest value of the final number of infected people, i.e. this number in the best and in the worst possible scenario.*/

import java.util.*

fun main(args : Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
while(t>0){
val n=sc.nextInt()
var a =ArrayList<Int>()
a.add(sc.nextInt())
var c=1
var min=10
var max=1
for(i:Int in 1 until n){
a.add(sc.nextInt())
if((a.get(i)-a.get(i-1))<=2){  c++ }
else if((a.get(i)-a.get(i-1))>2){  if(c<min){  min=c    }
		                           if(c>max){  max=c    }
		                           c=1
}
}
if(c<min){  min=c  }
if(c>max){  max=c  }
println("$min $max")
t--
}
}