import java.util.Scanner;
public class DoubleOpt{
public static void main(String[]args){
double a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
System.out.println(a+(b*c));
System.out.println((a*b)+c);
System.out.println(c+(a/b));
System.out.println((a%b)+c);
}
}