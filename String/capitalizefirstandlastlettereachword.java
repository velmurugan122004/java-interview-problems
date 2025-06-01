import java.util.*;
class capitalizefirstandlastlettereachword{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String []s2=s1.split(" ");
for(int i=0;i<s2.length;i++)
{
String s3=s2[i];
for(int j=0;j<s3.length();j++)
{
if(j==0 || j==s3.length()-1)
{
char c=s3.charAt(j);
System.out.print(Character.toUpperCase(c));
}
else{
System.out.print(s3.charAt(j));
}
}
System.out.print(" ");
}
}
}