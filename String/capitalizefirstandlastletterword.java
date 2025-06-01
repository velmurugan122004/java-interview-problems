import java.util.*;
class capitalizefirstandlastletterword{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
for(int i=0;i<s1.length();i++)
{
if(i==0 || i==s1.length()-1)
{
char c=s1.charAt(i);
System.out.print(Character.toUpperCase(c));
}
else{
System.out.print(s1.charAt(i));
}
}
}
}