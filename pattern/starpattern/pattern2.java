import java.util.*;
class pattern2
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
{int row=5,column=2;
Scanner s=new Scanner(System.in);
pattern2 ob=new pattern2();
ob.pattern(row,column);
}
}



