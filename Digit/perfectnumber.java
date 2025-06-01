import java.util.*;
class perfectnumber
{
static int perfect(int n)
{
int i,sum=0;
for(i=1;i<n;i++)
{
if(n%i==0)
{
sum=sum+i;
}
}
return sum;
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMBER: ");
int n=s.nextInt();
int add=perfect(n);
if(add==n)
{
System.out.print("PERFECT NUMBER");
}
else
{
System.out.print("NOT PERFECT NUMBER");
}
}
} 