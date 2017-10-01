public class Stats5 {
	/*
	*	main function to get average,max and min of Random value
	*/
	
    public static void main(String[] args) {
		//initialize value
       double sum=0,avg; 
	   double max=0.5,min=0.5;
       for(int i=0;i<5;i++)
       {
		   //generate random value 0.0 to 1.0
            double RandomValue=Math.random();
			//get max of two num
			max=Math.max(RandomValue,max);
			//get min of two num
			min=Math.min(RandomValue,min);
			
           System.out.println(RandomValue);
           sum=sum+RandomValue;
			
           
       }
        System.out.println("Average="+(sum/5));
		 System.out.println("Max="+max);
		System.out.println("Min="+min);
		System.out.println("sum is="+sum);
        
    }
}