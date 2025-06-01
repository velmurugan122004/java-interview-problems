import java.util.*;
class anagram{
public static String ascend(String s1)
{
char []a=s1.toCharArray();
for(int i=0;i<s1.length()-1;i++)
{
for(int j=i+1;j<s1.length();j++)
{
if(a[i]>a[j]){
char temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
return new String(a);
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();
if(ascend(s1).equals(ascend(s2)))
{
System.out.print("ANAGRAM");
}
else{
System.out.print("NOT ANAGRAM");
}
}
}
