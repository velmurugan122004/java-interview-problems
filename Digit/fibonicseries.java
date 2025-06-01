import java.util.*;
class fibonicseries
{
static void fibo(int n)
{ int a=0,b=1,c;
for(int i=0;i<n;i++)
{
System.out.print(a);
c=a+b;
a=b;
b=c;
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER NUMBER");
int n=s.nextInt();
fibo(n);
}
}