import java.util.*;
class longestword{
public static void main(String qr[]){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
int c=0,c1=0;
String m[]=s1.split(" ");
for(int i=0;i<m.length;i++){
String m1=m[i];
if(m1.length()!=0)
{
if(c<m1.length())
{
c=m1.length();
}
}
}
System.out.println("Longest word Length:"+c);
for(int i=0;i<m.length;i++){
String m2=m[i];
if(c==m2.length())
{
System.out.print("Longest word:"+m2);
}
}
}
}

