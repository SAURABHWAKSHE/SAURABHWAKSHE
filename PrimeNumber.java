import java.util.*;
public class PrimeNumber{

        public static void main(String args[]){ 
 /*****************************************************************************
	mInputNumber variable stores the number entered by the user as the input
  	mIsPrime variable stores if the number is prime or not
 ******************************************************************************/
 		int mInputNumber,IsPrime;

          	Scanner sc=new Scanner(System.in);
          	System.out.println("Enter the number\n");
          	mInputNumber=sc.nextInt();
		if(mInputNumber==1||mInputNumber==0){
			System.out.println("entered number is not prime");
		}
		  // try all possible factors of mInputNumber
          	for(IsPrime=2;IsPrime<=mInputNumber;IsPrime++){
		 // if IsPrime divides evenly into mInputNumber, minputNumber is not prime, so break out of loop
                	if(mInputNumber%IsPrime==0){
                        	System.out.println("entered number " +mInputNumber+ " is not a prime number");
               			break;
                	}
                	else{
                        	System.out.println("entered number " +mInputNumber+ " is a prime number");
                	break;
                	}
	  	}// End of for loop
	}
}