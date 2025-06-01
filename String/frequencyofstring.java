import java.util.*;
class frequencyofstring{
public static int count(String s,char c)
{
int count=0;
for(int i=0;i<s.length();i++)
{
if(c==s.charAt(i))
{
count++;
}
}
return count;
}
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
int c=count(s1,s1.charAt(i));
System.out.println(s1.charAt(i)+"-"+c);
s2+=s1.charAt(i);
}
}
}
}