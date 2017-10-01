import java.util.Scanner;
public class Sqrt{
public static void main(String[]arg){
Scanner s=new Scanner(System.in);
double c=s.nextDouble();
double t=c;
t=(c/t+t)/2;
double epsilon=1e-15;
while(Math.abs(t-c/t)>epsilon*t){
t=(c/t+t)/2;
}
System.out.println("The sqrt of "+ c +" is "+t);
}
}