import java.lang.Integer;
import java.lang.Math;
public class PowerOf2{
public static void main(String [] arg){
int n=Integer.parseInt(arg[0]);
for(int i=0;i<=n;i++){
System.out.println("table is:"+Math.pow(2,i));
}
}
}