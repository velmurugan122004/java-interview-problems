import java.util.*;
class powerofvalue
{
static void power(int base,int expo)
{
int p=1;
for(int i=0;i<expo;i++)
{
p=p*base;
}
System.out.println("Power of given base and exponent:"+p);
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER BASE VALUE:");
int base=s.nextInt();
System.out.print("ENTER EXPONENT VALUE:");
int expo=s.nextInt();
power(base,expo);
}
}