import java.util.*;
class removeduplicatestring{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2="";
for(int i=0;i<s1.length();i++)
{
boolean found=false;
for(int j=0;j<s2.length();j++)
{
if(s2.charAt(j)==s1.charAt(i))
{
found=true;
break;
}
}
if(!found){
System.out.print(s1.charAt(i));
s2+=s1.charAt(i);
}
}
}}