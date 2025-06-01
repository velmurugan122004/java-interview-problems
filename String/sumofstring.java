import java.util.*;
class sumofstring{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int sum=0;
for(int i=0;i<s1.length();i++)
{
sum+=s1.charAt(i);
}
System.out.print(sum);
}
}


