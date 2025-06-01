import java.util.*;
class countofdigit
{
static void count(int t)
{ int c=0;
while(t>0)
{
t=t/10;
c++;
}
System.out.println("COUNT OF DIGIT: "+c);
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
int s1=s.nextInt();
count(s1);
}
}