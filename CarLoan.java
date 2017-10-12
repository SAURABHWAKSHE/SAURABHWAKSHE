/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/CarLoan.java
  *  Execution:    java -cp bin com.bridgelabz.util.CarLoan
  *  
  *  Purpose:program to Carloan
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.lang.Math;

public class CarLoan{
public static void main(String[]arg){
//declaring variables
int P,Y;
float R;
//accept P,Y and R from user via command line
P=Integer.parseInt(arg[0]);
Y=Integer.parseInt(arg[1]);
R=Float.parseFloat(arg[2]);
//given formulae
int n=12*Y;
float r=R/(12*100);
double payment=((P*r)/(1-Math.pow(1+r,-n)));
System.out.println(" The monthly compound interest is "+payment);
}
}