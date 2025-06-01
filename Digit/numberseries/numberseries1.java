import java.util.*;
class numberseries1
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMBER TO SERIES");
int num=s.nextInt();
for(int  i=1;i<=num;i++)
{
if(i%2==0)
{
System.out.print(i-1+" ");
}
else
{
System.out.print(i+1+" ");
}
}
}
}
