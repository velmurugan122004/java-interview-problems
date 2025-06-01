import java.util.*;
class hollowpyramid
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF PATTERN:");
int r=s.nextInt();
for(int i=1;i<=r;i++)
{
for(int j=r;j>i;j--)
{
System.out.print(" ");
}
for(int k=1;k<=i*2-1;k++)
{
if(i==r || k==1 || k==i*2-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
