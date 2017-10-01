 import java.util.Scanner;
 
public class Sin1 {
	//variable declaration
    static double fact=1,sum=0,number=8,i=1;
    static double counter=2,angleDegree,sumSinx;
    static double angleRadian;
	//method to find factorial
    public static double factorial(double number)
    {
       while(number>0)
       {
           fact=fact*number;
           number=number-1;
       }
       return fact;
    }
	//method to displaySeries
	public static void displaySeries(double angleRadian )
	{
		while(i<number)
        {
            System.out.print(angleRadian+"^"+i+"/");
            System.out.print(i+"!");
            if(counter%2==0)
                System.out.print("-");
            else
                System.out.print("+");
            counter++;
            i=i+2;
        }
	}
    //main method to get sinx 
    public static void main(String[] args) {
            
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the angle:");
        angleDegree=input.nextInt();
       //deg to radian
        angleRadian=angleDegree * (Math.PI/180);
        displaySeries(angleRadian);
        i=1;
      
        while(i<number)
        {
            sum+=Math.pow(angleRadian, i)/factorial(i);
        
            i=i+2;
        }
        System.out.println("\nsinx="+sum);
        
    }
    
}