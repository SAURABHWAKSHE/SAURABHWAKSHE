/******************************************************************************
  *  Compilation:  javac -d bin com/bridgelabz/util/Binary.java
  *  Execution:    java -cp bin com.bridgelabz.util.Binary
  *  
  *  Purpose:program to find binary representation of decimal no. and representing it in 4 bytes
  *
  *  @author  Saurabh Wakshe
  *  @version 1.8
  *  @since   28-09-2017
  *
 ******************************************************************************/
package com.bridgelabz.util;
import java.lang.Integer;
import java.util.Scanner; 
public class Binary{
/*
*main method to find binary equivalent
*/
public static void main(String arg[]){
int i=0,n,b=0;
int binary[]=new int[32];//32 of size 32 to store binary no. in 4 byte form
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0){
binary[i]=n%2;
n=n/2;
i++;
}
/*
*4 byte representation
*/
for(i=binary.length;i<=31;i++){
binary[i]=b;
}
/*
*displaying final binary no.
*/
for(int j=i-1;j>=0;j--){
System.out.print(binary[j]);

}
}
}
