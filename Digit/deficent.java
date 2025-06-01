import java.util.*;
class deficent
{
public static void main(String ar[])
{
Scanner d=new Scanner(System.in);
System.out.print("ENTER THE NUMBER:");
int n=d.nextInt();
int sum=0;
for(int i=1;i<n;i++)
{
if(n%i==0)
{
sum+=i;
}
}
if(sum<n)
{
System.out.print("THE GIVEN NUMBER IS DEFCIENT");
}
else
{
System.out.print("THE GIVEN NUMBER IS NOT DEFICIENT");
}
}
}