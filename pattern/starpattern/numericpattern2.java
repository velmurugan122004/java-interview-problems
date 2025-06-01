import java.util.*;
class numericpattern2
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENETR THE SIZE OF THE ROW IN PATTERN:");
int r=s.nextInt();
System.out.print("ENETR THE SIZE OF THE COLUMN IN PATTERN:");
int c=s.nextInt();
int n=1;
for(int i=1;i<=r;i++)
{
for(int j=1;j<=c;j++)
{
if(i==1 || i==r || j==1 || j==c)
{
 System.out.print("3");
}
else
{
System.out.print(n);
n++;
}
}
System.out.println();
}
}
}