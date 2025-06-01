import java.util.*;
class pattern6
{
static void pattern6(int r)
{
int i,j,k;
for(i=1;i<=r;i++)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(k=r;k>=i;k--)
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
pattern6(size);
}
} 