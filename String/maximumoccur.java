import java.util.*;
class maximumoccur{
public static int count(String s1,char a)
{
int count=0;
for(int i=0;i<s1.length();i++)
{
if(a==s1.charAt(i))
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
int max=0;
for(int i=0;i<s1.length();i++)
{
int c=count(s1,s1.charAt(i));
if(max<c)
{
max=c;
}
}
for(int j=0;j<s1.length();j++)
{
int c1=count(s1,s1.charAt(j));
if(max==c1)
{
System.out.print(s1.charAt(j)+"-"+c1);
break;
}
}
}
}