import java.util.*;
class abundant
{
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
System.out.print("ENTER THE NUMBER");
int num=s1.nextInt();
int i,sum=0;
for(i=1;i<num;i++)
{
if(num%i==0)
{
sum+=i;
}
}
if(sum>num)
{
System.out.print("THE GIVEN NUMBER IS ABUNDANT");
}
else
{
System.out.print("THE GIVEN NUMBER IS NOT ABUNDANT");
}
}
}