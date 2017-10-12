/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Prime.java
  *  Execution:    java -cp bin com.bridgelabz.util.Prime
  *  
  *  Purpose:program to determine prime no.s between 1 to 100
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
public class Prime{
public static void main(String[]args){
int i=0,j;
int num=100;
if (i==1||i==0){
System.out.println(i +" is not a primenumber");
}

for(i=0;i<=num;i++){
boolean isPrime= true; 
for(j=2;j<=i-1;j++)
{
if(i%j==0){
isPrime= false;
break;
}
}
if(isPrime==true)
{
System.out.println(i +" is a primenumber");
}
else{
	System.out.println(i +" is not a primenumber");
}
}
}
}
