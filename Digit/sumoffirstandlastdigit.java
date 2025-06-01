import java.util.*;
class sumoffirstandlastdigit
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER DIGIT");
int n=s.nextInt();
int l,sum;
l=n%10;
System.out.println("LAST DIGIT:"+l);
while(n>=9)
{
n=n/10;
}
System.out.println("FIRST DIGIT:"+n);
sum=l+n;
System.out.println("SUM OF FIRST&LAST DIGIT:"+sum);
}
}

