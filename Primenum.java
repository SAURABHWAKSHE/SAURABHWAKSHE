import java.util.Scanner;
import java.lang.Integer;

public class Primenum{
	
	static int s1,s2,i,j,flag=0;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the lower limit :");
		s1=sc.nextInt();
//		System.out.println(" Enter the lower limit :");
		//s2=sc.nextInt();
		System.out.println("\nEnter the upper limit :");
		s2=sc.nextInt();
		System.out.println("\nThe numbers in range are :\n");
		
		for(i=s1;i<s2;i++){
			for(j=2;j<i;j++){
				/*checks the condition whether remainder is 0 if yes it is nonprime no*/
				if(i%j==0){
				flag=0;
				break;
				}
				else{
					flag=1;
				}
			}
				if(flag==1){
					System.out.println(i);
				}
		}
	}
}