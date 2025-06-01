import java.util.*;
class pyramid
{
static void pattern(int r)
{
int i,j,k;
for(i=1;i<=r;i++)
{
for(j=r-1;j>=i;j--)
{
System.out.print(" ");
}
for(k=1;k<=(i*2)-1;k++)
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
pattern(size);
}
} 