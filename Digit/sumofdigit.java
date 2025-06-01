import java.util.*;
class sumofdigit
{
void sum(int v)
{
int r,sum=0;
while(v>0)
{
r=v%10;
sum+=r;
v=v/10;
}
System.out.println("SUM OF DIGIT:"+sum);
}
public static void main (String ar[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
sumofdigit ob=new sumofdigit();
ob.sum(x);
}
}