import java.util.*;
class pattern3
{
void pattern(int r,int c)
{int i,j;
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
System.out.print("@");
}
System.out.println();
}
}
public static void main(String ar[])
{int row=2,column=4;
Scanner s=new Scanner(System.in);
pattern3 ob=new pattern3();
ob.pattern(row,column);
}
}
