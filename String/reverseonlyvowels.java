import java.util.*;
class reverseonlyvowels{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
for(int i=s1.length()-1;i>=0;i--)
{
char c=s1.charAt(i);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
{
System.out.print(c);
}
}
}
}
