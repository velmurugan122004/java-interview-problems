import java.util.*;
class sumoffactors
{
void factornum(int n)
{ int sum=0,C;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
sum+=i;
System.out.print(i+"+");
}
}
System.out.println(sum);
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
System.out.println("DISPLAY SUM OF FACTOR GIVEN NUMBER");
sumoffactors ob=new sumoffactors();
ob.factornum(n1);
}
}

