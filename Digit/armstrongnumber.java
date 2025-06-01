import java.util.*;
import java.lang.*;
class armstrongnumber
{
static int armstrong(int t)
{ int c=0,t2,r,sum=0;
t2=t;
while(t>0)
{
t=t/10;
c++;
}
t=t2;
for(int i=0;i<t;i++)
{
r=t%10;
double p=Math.pow(r,c);
sum+=p;
t=t/10;
}
return sum;
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int s1=s.nextInt();
int sum1=armstrong(s1);
if(sum1==s1)
{
System.out.println("THE GIVEN NUMBER IS ARMSTRONG NUMBER");
}
else
{
System.out.println("THE  GIVEN NUMBER IS NOT ARMSTRONG");
}
}
}