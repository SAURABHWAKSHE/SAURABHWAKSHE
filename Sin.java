public class Sin {
    // function to find factorial
    public static long factorial(int n)
     {
		 int fact=1;
         while(n>0)
         {
             fact=fact*n;
             n--;
         }
         return (fact);
     }
    public static void main(String args[]){
        double angleX = Integer.parseInt(args[0]);
        int copyOfAngleX = (int)angleX;
        angleX = angleX%(2 * Math.PI);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for sin x
        double sinvalue = angleX - Math.pow(angleX,3) / factorial(3) + Math.pow(angleX,5) / factorial(5)
                        - Math.pow(angleX,7) / factorial(7);
        System.out.println("Sin " + copyOfAngleX + " = " + sinvalue);
    }
}
