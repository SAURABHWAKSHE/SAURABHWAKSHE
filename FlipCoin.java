/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/FlipCoin.java
  *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin
  *  
  *  Purpose:program to no of heads and tails
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.util.Scanner; 
public class FlipCoin {
	static int n,head,tail;
	/*
    * The main function is written to get FlipCoin
    */
    public static void main(String[] args) {
    /*
    * Initializing head and tail to 0
    */        
		head=0;tail=0;
	/*
    * Scanner class to get input of no. of simulation
    */
        Scanner in=new Scanner(System.in);
        System.out.println("No. of times coin simulation");
         n=in.nextInt();
	/*
    * No. times FlipCoin simulation
    */
        for(int i=0;i<n;i++)
        {
			//if Math.random function generates less than 0.5 than head
            if(Math.random()>0.5)
            {
                System.out.println("it's Head with 50% chances");
				//counter for head
                head++;
            }
			//if Math.random function generates greater equal to 0.5 than tail
            else
            {
                System.out.println("it's TAIL with 50% chances");
				//counter for tail
                tail++;
            }
        }
	/*
    * Head vs tail average percentage
    */
        System.out.println("Head Percentage:"+(100*head/(n)));
        System.out.println("Tail Percentage:"+(100*tail/(n)));
    }
    
}