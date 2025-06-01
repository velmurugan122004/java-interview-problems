import java.util.*;
class pattern1
{
void pattern(int r,int c)
{int i,j;
for(i=1;i<=r;i++)
{
for(j=1;j<=c;j++)
{
System.out.print("*");
}
System.out.println();
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER ROW SIZE: ");
int row=s.nextInt();
System.out.print("ENTER COLUMN SIZE: ");
int column=s.nextInt();
pattern1 ob=new pattern1();
ob.pattern(row,column);
}
}



