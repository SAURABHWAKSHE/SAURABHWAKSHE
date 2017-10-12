/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/DayOfWeek.java
  *  Execution:    java -cp bin com.bridgelabz.util.DayOfWeek
  *  
  *  Purpose:program to find DayOfWeek
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
public class DayOfWeek {
	//for storing m,y,d
	static int month,year,day;
	//y0,x,m0,d0 for further calculation according to gregorian calender
	static int y0,m0,d0,x;
	/*
	*	main function to calculate day of week
	*/
    public static void main(String[] args) {
		//accept month
         month=Integer.parseInt(args[0]);
		//accept day
        day=Integer.parseInt(args[1]);
		//accept year
         year=Integer.parseInt(args[2]);
       //calculate according to gregorian calender
       y0=year-(14-month)/12;
       x=y0+y0/4-y0/100+y0/400;
       m0=month+12*((14-month)/12)-2;
       d0=(day+x+31*m0/12)%7;
       System.out.println("year:"+y0+" month:"+m0+" day:"+d0);
        
        
    }
    
}
