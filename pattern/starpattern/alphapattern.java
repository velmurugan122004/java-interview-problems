import java.util.*;
class alphapattern
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENETR THE SIZE OF THE PATTERN:");
int r=s.nextInt();
System.out.println("ENETR START CHARCTER IN PATTERN:");
char ch='A';
for(int i=1;i<=r;i++)
{
for(int j=1;j<=i;j++)
{
 System.out.print(ch);
}
ch++;
System.out.println();
}
}
}