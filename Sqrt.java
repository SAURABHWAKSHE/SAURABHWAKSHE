

/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt
 *  
 *  Purpose:to find sqrt of given no.
 *
 *  @author  Saurabh Wakshe
 *  @version 1.8
 *  @since   27-09-2017
 *
******************************************************************************/import java.util.Scanner;
public class Sqrt{
  /*
  * main method to find square root
  */
public static void main(String[]arg){
  /*
  * scanner class to accept input
  */
Scanner s=new Scanner(System.in);
double c=s.nextDouble();
double t=c;
    /*
  * finding squareroot using Newton's method
  */
t=(c/t+t)/2;
double epsilon=1e-15;
while(Math.abs(t-c/t)>epsilon*t){
t=(c/t+t)/2;
}
    /*
  * printing the result
  */
System.out.println("The sqrt of "+ c +" is "+t);
}
}
