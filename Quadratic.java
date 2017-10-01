import java.util.Scanner;
import java.lang.Integer;
import java.lang.Double;

public class Quadratic{
	public static void main(String[] args) {
		int a, b ,c;
		double root1 , root2 , delta;

		Scanner sc=new Scanner(System.in);
		System.out.println("Given Quadratic equation : ax^2+bx+c ");
		System.out.println("Enter the value of a:");
		a=sc.nextInt();
		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		System.out.println("Enter the value of c:");
		c=sc.nextInt();

		System.out.println("Given Quadratic equation : "+ a + " x^2+ " + b + " x+ " + c);

		delta=b*b-4*a*c;

		if(delta>0){
			System.out.println(" Roots are real and unequal");
			root1=(-b+Math.sqrt(delta)/2*a);
			root2=(-b-Math.sqrt(delta)/2*a);

			System.out.println(" First root is : " +root1);
			System.out.println(" Second root is : " +root2);
		}
		else if (delta==0) {
		System.out.println("Roots are real and equal");
		root1=(-b+Math.sqrt(delta)/2*a);
		System.out.println("Root =" + root1);
		}
		else{
			System.out.println("Roots are Imaginary");
		}

	}
}