import java.util.*;
class hollowdiamond
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF PATTERN:");
int r=s.nextInt();
int i,j,k,r1;
r1=r-1;
for(i=1;i<=r;i++)
{
for(j=r;j>i;j--)
{
System.out.print(" ");
}
for(k=1;k<=i*2-1;k++)
{ 
if(k==1 || k==i*2-1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
for(i=1;i<=r;i++)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(k=1;k<=(r-i+1)*2-1;k++)
{
if( k==1||k==(r-i+1)*2-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
