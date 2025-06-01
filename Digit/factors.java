import java.util.*;
class factors
{
void factornum(int n)
{
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
System.out.print(i+" ");
}
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
System.out.println("DISPLAY FACTOR OF GIVEN NUMBER");
factors ob=new factors();
ob.factornum(n1);
}
}

