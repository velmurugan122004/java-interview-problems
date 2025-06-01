import java.util.*;
class panagram{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
boolean []alpha=new boolean[26];
int index=0,flag=1;
for(int i=0;i<s1.length();i++)
{
if(s1.charAt(i)>=65 && s1.charAt(i)<=90)
{
index=s1.charAt(i)-'A';
}
else if(s1.charAt(i)>=97 && s1.charAt(i)<=122)
{
index=s1.charAt(i)-'a';
}
alpha[index]=true;
}
for(int j=0;j<=25;j++)
{
if(alpha[j]==false)
{
flag=0;
}
}
if(flag==0)
{
System.out.print("NOT A PANAGRAM");
}
else{
System.out.print("PANAGRAM");
}
}
}