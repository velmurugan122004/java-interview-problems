import java.util.*;
class butterflypattern
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF PATTERN:");
int r=s.nextInt();
for(int i=1;i<=r;i++)
{
for(int j=1;j<i;j++)
{
System.out.print("  ");
}
for(int k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println();
}
for(int i=1;i<=r;i++)
{
for(int j=r;j>=i;j--)
{
System.out.print("  ");
}
for(int k=r;k<=(r-i+1)*2-1;k++)
{
System.out.print("*");
}
System.out.println();
}
for(int o=1;o<=r;o++)
{
for(int p=r;p>o;p--)
{
System.out.print("-");
}
for(int q=1;q<=o;q++)
{
System.out.print("*");
}
}

}
}

