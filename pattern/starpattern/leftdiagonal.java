import java.util.*;
class leftdiagonal
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF PATTERN:");
int r=s.nextInt();
for(int i=1;i<=r;i++)
{
for(int j=1;j<=r;j++)
{
if(i==j)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}

