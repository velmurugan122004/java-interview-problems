import java.util.*;
class removeparticularstring{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
String []m=s1.split(" ");
String s4="";
for(int i=0;i<m.length;i++)
{
String s3=m[i];
if(!s3.equals(s2))
{
s4+=m[i]+" ";
}
}
System.out.print(s4);
}
}


