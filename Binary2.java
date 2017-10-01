import java.lang.Integer;
public class Binary2{
static int n;
static int p=1;
public static void main(String arg[]){
n=Integer.parseInt(arg[0]);
while(p<=n/2){
p*=2;
}
while(p>0){
if(n<p)
System.out.println(0);
else{
System.out.println(1);
n-=p;
}
p/=2;
}
System.out.println();
}
}