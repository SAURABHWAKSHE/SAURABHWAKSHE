/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Distance.java
  *  Execution:    java -cp bin com.bridgelabz.util.Distance
  *  
  *  Purpose:program to find distance
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
public class Distance{
	public static void main(String[] args) {
		//parse x and y coordinates from command line arguments
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);

		//compute distance to(0,0)
		double distance=Math.sqrt(x*x+y*y);

		//output distance
		System.out.println("distance from the point " + x + " , " + y + " to the origin (0,0) = " +distance);
	}
}
