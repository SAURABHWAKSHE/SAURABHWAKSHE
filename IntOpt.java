/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/IntOpt.java
  *  Execution:    java -cp bin com.bridgelabz.util.IntOpt
  *  
  *  Purpose:program to perform diffrent operations on integer numbers
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class IntOpt{
public static void main(String[]args){
/*
*Declaring variables
*/
int a,b,c;
  
/*
*Accepting input through Scanner class
*/
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
  
/*
*performing operations and printing the result
*/
System.out.println(a+b*c);
System.out.println(a*b+c);
System.out.println(c+a/b);
System.out.println(a%b+c);
}
}
