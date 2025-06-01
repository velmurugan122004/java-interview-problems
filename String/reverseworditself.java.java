import java.util.*;
class reverseworditself{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String m[]=s1.split(" ");
/*for(String t:m){
System.out.print(t);
}*/
String m1[]=new String[m.length];
for(int i=0;i<m.length;i++)
{
String s2=m[i];
String x=new String();
for(int j=s2.length()-1;j>=0;j--){
x+=s2.charAt(j);
}
m1[i]=x;
}
for(String t:m1){
System.out.print(t+" ");
}
}
}