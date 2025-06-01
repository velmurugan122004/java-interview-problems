import java.util.*;
class separateandeliminate
{
void sepandelim(int v)
{
int r;
while(v>0)
{
r=v%10;
System .out.println("SEPARATE DIGITS ARE:"+r);
v=v/10;
}
}
public static void main (String ar[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
separateandeliminate ob=new separateandeliminate();
ob.sepandelim(x);
}
}