/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SumOfTwoDice.java
 *  Execution:    java -cp bin com.bridgelabz.util.SumOfTwoDice
 *  
 *  Purpose:add two random no. obtained on two dice 
 *
 *  @author  Saurabh Wakshe
 *  @version 1.8
 *  @since   25-10-2017
 *
******************************************************************************/
package com.bridgelabz.util;

public class SumOfTwoDice { 
	/*
	*main method to generate random no. and add them 
	*/
    public static void main(String[] args) {
        int SIDES = 6;
        int a = 1 + (int) (Math.random() * SIDES);
        int b = 1 + (int) (Math.random() * SIDES);
        int sum = a + b;
       	/*
	*print the numbers and find sum
	*/
	System.out.println(a);
	System.out.println(b);
	System.out.println(sum);
    }
}
