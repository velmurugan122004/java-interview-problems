import java.util.*;
class reverseonlyalphabet{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
for(int i=s1.length()-1;i>=0;i--)
{
if((s1.charAt(i)>=65 && s1.charAt(i)<=90)|| (s1.charAt(i)>=97 && s1.charAt(i)<=122)){
System.out.print(s1.charAt(i));
}
}
}
}