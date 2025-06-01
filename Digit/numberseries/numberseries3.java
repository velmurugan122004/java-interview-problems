import java.util.*;
import java.lang.*;
class numberseries3
{
public static void main(String ar[])
{
Scanner s= new Scanner(System.in);
System.out.print("ENTER NUMBER TO SERIES");
int num=s.nextInt();
int c=1;
double p;
for(int i=1;i<=num;i++)
{
if(i%2==0)
{
System.out.print(i-1+" ");
}
else
{
p=Math.pow(c,3);
int o=(int) p;
System.out.print(o+" ");
c++;
}
}
}
} 