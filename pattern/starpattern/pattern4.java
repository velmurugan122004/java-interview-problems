import java.util.*;
class pattern4
{
void pattern(int r)
{int i,j;
for(i=1;i<=r;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int size=s.nextInt();
pattern4 ob=new pattern4();
ob.pattern(size);
}
}
