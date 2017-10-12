/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Rolldie.java
  *  Execution:    java -cp bin com.bridgelabz.util.Rolldie
  *  
  *  Purpose:program to roll a die n times and find which number is occuring max no. of times
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Random;
import java.util.Scanner;
public class Rolldie
{
	public static void main(String []arg)
	{
	int n,j,i=0;
	Scanner sc=new Scanner(System.in);
	System.out.println ("Enter the value of n:"); 
        n = sc.nextInt();
	int a[]=new int[n];
	
	while(i<n)
	{
		Random rand = new Random();
		int roll= rand.nextInt(6) + 1;
		System.out.println(roll);
		a[i]=roll;
		i++;
	}

	int maxCount, maxElement=0, count;
    maxCount =0;
    /* Count the frequency of every elemenet of array, 
    and check if it is greater than maximum count element 
    we found till now and update it accordingly  */
    for(i = 0; i<n; i++){
    	count = 1;
    	for(j = i+1; j <n; j++){
            if(a[j] == a[i]){
                count++;
                /* If count of current element is more than 
                maxCount, uodate maxCount and maxElement */
                if(count > maxCount){
                    maxCount = count;
                    maxElement = a[j];
                }
            }
        }
    }
    System.out.println("Maximum Repeating Element :"+maxElement+" count:"+ maxCount);
}
}