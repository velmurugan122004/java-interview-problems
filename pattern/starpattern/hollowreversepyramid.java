import java.util.*;
class hollowreversepyramid
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF PATTERN:");
int r=s.nextInt();
int i,j,k;
for(i=1;i<=r;i++)
{
for(j=1;j<i;j++)
{
System.out.print(" ");
}
for(k=1;k<=(r-i+1)*2-1;k++)
{
if( j==1||k==1||k==(r-i+1)*2-1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}
