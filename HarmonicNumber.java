/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/HarmonicNumber.java
  *  Execution:    java -cp bin com.bridgelabz.util.HarmonicNumber
  *  
  *  Purpose:program to find nth HarmonicNumber
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   29-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
public class HarmonicNumber{
public static void main(String[]arg){
double sum=0.0;
int n=Integer.parseInt(arg[0]);
for(int i=1;i<=n;i++){
sum=sum+Math.pow(i,-1);

}
System.out.println("The "+n+"th HarmonicNumber is "+sum);
}
}