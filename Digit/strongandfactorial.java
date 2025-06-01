import java.util.*;
class strongandfactorial
{
public static  void main(String ar[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int x2,f,sum=0,r,i;
x2=x;
while(x!=0)
{
r=x%10;
f=1;
for(i=1;i<r;i++)
{ f=f*i;
}
sum+=f;
x=x/10;
}
x=x2;
if(x==sum)
{
System.out.print("STRONG NUMBER");
}
else
{
System.out.print("NOT STRONG NUMBER");
}
}
}

