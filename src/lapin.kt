/*Lapindrome is defined as a string which when split in the middle, gives two halves having the same characters and same frequency of each character. If there are odd number of characters in the string, we ignore the middle character and check for lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have the same characters with same frequency. Also, abccab, rotor and xyzxy are a few examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves contain the same characters but their frequencies do not match.
Your task is simple. Given a string, you need to tell if it is a lapindrome.*/

import java.util.*;
fun main(args: Array<String>){
val sc=Scanner(System.`in`)
var t=sc.nextInt()
var s=sc.nextLine()
while(t>0){
s=sc.nextLine()
var l=s.length
var s1=s.substring(0,l/2)
var s2=String()
if(l%2==0){
s2=s.substring(l/2,l);
}
else{
s2=s.substring(l/2+1,l);
}
//println(s1)
//println(s2)
var f=1
var a=0
var b=0
for(a in 'a'..'z'){
var c1=0
var c2=0
for(b in 0 until s1.length){
if(s1.get(b)==a){
c1++
}
if(s2.get(b)==a){
c2++
}
}
if(c1!=c2){
f=0
break
}
}
if(f==1){
println("YES")
}
else println("NO")
t--
}
}