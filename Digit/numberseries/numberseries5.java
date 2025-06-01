import java.util.*;
class numberseries5
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMBER");
int num=s.nextInt();
int temp1=1,temp2=1;
for(int i=2;i<=num;i++)
{
if(i%2==0)
{
int b=(int) (Math.pow(temp1,2));
System.out.print(b+" ");
temp1++;
}
else
{
int c=(int) (Math.pow(temp2,3));
System.out.print(c+" ");
temp2++;
}
}
}
}

