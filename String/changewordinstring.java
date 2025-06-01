import java.util.*;
class changewordinstring
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE STRING:");
String s1=s.nextLine();
System.out.print("WHICH STRING IS REPLACE:");
String s2=s.nextLine();
System.out.print("WHAT STRING REPLACE:");
String s3=s.nextLine();
String m[]=s1.split(" ");
for(int i=0;i<m.length;i++)
{
String s4=m[i];
if(!s2.equals(s4))
{
System.out.print(s4+" ");
}
else{
System.out.print(s3+" ");
}
}
}
}