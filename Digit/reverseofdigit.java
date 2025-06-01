import java.util.*;
class reverseofdigit
{
void reverse(int v)
{
int r,rev=0;
while(v>0)
{
r=v%10;
rev=(rev*10)+r;
v=v/10;
}
System.out.print("REVERSE OF DIGIT:"+rev);
}
public static void main (String ar[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
reverseofdigit ob=new reverseofdigit();
ob.reverse(x);
}
}