import java.util.*;
class primenumber
{
static int prime(int n)
{ int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}
}
return c;
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.println("ENTER NUMBER");
int n=s.nextInt();
int pri=prime(n);
if(pri==2)
{
System.out.print("PRIME NUMBER");
}
else
{
System.out.print("NOT PRIME NUMBER");
}
}
}