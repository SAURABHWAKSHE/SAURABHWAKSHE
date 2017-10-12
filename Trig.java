/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Trig .java
  *  Execution:    java -cp bin com.bridgelabz.util.Trig 
  *  
  *  Purpose:program to perform trignometric operations
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner;
public class Trig {
	/*
	*	main function to perform trignometric operation
	*/
    public static void main(String[] args) {
    /*
	*	Scanner class used to accept input from user
	*/
        Scanner input=new Scanner(System.in);
		//enter angle in degree
        System.out.print("Please enter the angle:");
        double degree=input.nextInt();
       //convert angle from degree to radian 
      double  radian=Math.toRadians(degree);
	  //find sine of angle
      double sine=Math.sin(radian);
	  //find cosine of angle
      double cosine=Math.cos(radian);
      
        System.out.println("Angle in radians:"+radian);
        System.out.println("Sine of "+radian+" is= "+sine);
        System.out.println("Cosine of "+radian+" is= "+cosine);
    }
    
}