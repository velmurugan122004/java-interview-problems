import java.util.*;
class pattern5
{
static void pattern5(int r)
{
int i,j;
for(i=1;i<=r;i++)
{
for(j=r;j>=i;j--)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER PATTERN SIZE:");
int size=s.nextInt();
pattern5(size);
}
} 