/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/PowerOf2.java
  *  Execution:    java -cp bin com.bridgelabz.util.PowerOf2
  *  
  *  Purpose:program to power of two of a given no.
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.lang.Integer;
import java.lang.Math;
public class PowerOf2{
/*
*main function to find power of two
*/
public static void main(String [] arg){
/*
*Accepting input through command line argument
*/
int n=Integer.parseInt(arg[0]);
for(int i=0;i<=n;i++){
System.out.println("table is:"+Math.pow(2,i));//printing table
}
}
}
