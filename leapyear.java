import java.util.*;
class leapyear
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE YEAR:");
int y=s.nextInt();
if((y%400==0)|| (y%100!=0 && y%4==0))
{
System.out.print("THE GIVEN "+y+" IS A LEAP YEAR");
}
else
{
System.out.print("THE GIVEN "+y+"IS NOT A LEAP YEAR"); 
}

}
}