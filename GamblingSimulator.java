/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/GamblingSimulator.java
  *  Execution:    java -cp bin com.bridgelabz.util.GamblingSimulator
  *  
  *  Purpose:program GamblingSimulator
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
public class GamblingSimulator {
//MAIN METHOD FOR SIMULATION
    public static void main(String args[]){
	//ACCEPTING INPUT FROM USER
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        float bet = 0;
        int win = 0;
//CHECK OUT OF TRIALS TIMES FOR WIN AND BET MADE
        for(int i = 0;i < trials;i++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                bet++;
                if(Math.random() > 0.5)
                    cash++;
                else
                    cash--;
            }
            if(cash == goal)
                win++;
        }
		//PRINTING OUTPUT
        System.out.println("No. of time won is: " + win);
        System.out.println("Percentage win is: " + 100 * win / trials +"%");
        System.out.println("Average no. of bets made is: "+ bet / trials);
    }
}