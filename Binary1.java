
import java.lang.Integer;
import java.util.Scanner; 
public class Binary1{
public static void main(String arg[]){
int i=0,n,b=0;
int binary[]=new int[32];
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0){
binary[i]=n%2;
n=n/2;
i++;
}
for(i=binary.length;i<=31;i++){
binary[i]=b;
}
System.out.println(i);
for(int j=i-1;j>=0;j--){
System.out.print(binary[j]);

}
}
}
