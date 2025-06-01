import java.util.*;
class sumoftilldigit
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER DIGIT");
int n=s.nextInt();
int l,sum=0;
while(n>0 || sum>9)
{
if(n==0)
{
n=sum;
sum=0;
}
l=n%10;
sum+=l;
n=n/10;
}
System.out.print("SUM OF TILL DIGIT:"+sum);
}
}

