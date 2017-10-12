/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/DoubleOpt.java
  *  Execution:    java -cp bin com.bridgelabz.util.DoubleOpt
  *  
  *  Purpose:program to perform diffrent operations on doubles numbers
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class DoubleOpt{
public static void main(String[]args){
/*
*Declaring variables
*/
double a,b,c;

/*
*Accepting inputs from user through Scanner class
*/
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();

/*
*performing diffrent operations and printing the result
*/
System.out.println(a+(b*c));
System.out.println((a*b)+c);
System.out.println(c+(a/b));
System.out.println((a%b)+c);
}
}
