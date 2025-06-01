import java.util.*;
class removebracketinalgebraexp{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER ALGEBRAIC EXPRESION(ex:(x^2+2x+9)):");
String s1=s.nextLine();
char c1='(';
char c2=')';
for(int i=0;i<s1.length();i++)
{
char c=s1.charAt(i);
if(c1==s1.charAt(i)|| c2==s1.charAt(i))
{

}
else{
System.out.print(s1.charAt(i));
}
}
}}