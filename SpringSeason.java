/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/SpringSeason.java
 *  Execution:    java -cp bin com.bridgelabz.util.SpringSeason
 *  
 *  Purpose:program to find the day lies in Springseason or not
 *
 *  @author  Saurabh Wakshe
 *  @version 1.8
 *  @since   27-09-2017
 *
******************************************************************************/
package com.bridgelabz.util;
import java.lang.Integer;

public class SpringSeason{
	public static void main(String[] args) {
		/*parse is a method which take a string(input) as an argument and convert in double
		* month variable stores the input entered by the user
		* day variable stores the number entered by the user as input
		*/
		int month=Integer.parseInt(args[0]);
		int day=Integer.parseInt(args[1]);

		/*A Boolean value is one with two choices: true or false, yes or no, 1 or 0.*/
		boolean IsSpring= (month==3 && day>=20 && day<=31)
						||(month==4 && day>=1 && day<=30)
						||(month==5 && day>=1 && day<=31)
						||(month==6 && day>=1 && day<=20);

		/*prints whether it is leapyear or not*/
		System.out.println(IsSpring);
	}
}		
