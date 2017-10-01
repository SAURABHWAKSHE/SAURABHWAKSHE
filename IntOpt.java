import java.util.Scanner;
public class IntOpt{
public static void main(String[]args){
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println(a+b*c);
System.out.println(a*b+c);
System.out.println(c+a/b);
System.out.println(a%b+c);
}
}