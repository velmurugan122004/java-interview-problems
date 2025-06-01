import java.util.*;
class numberseries4
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER YOUR NUMBER:");
int num=s.nextInt();
int a=0,b=1,c;
for(int i=1;i<=num;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
else
{
System.out.print(a+" ");
c=a+b;
a=b;
b=c;
}
}
}
}




