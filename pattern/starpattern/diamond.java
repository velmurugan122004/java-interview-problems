import java.util.*;
class diamond
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
for(int o=1;o<=r;o++)
{
for(int p=1;p<o;p++)
{
System.out.print(" ");
}
for(int q=1;q<=(r-o+1)*2-1;q++)
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
pattern(size);
}
}


