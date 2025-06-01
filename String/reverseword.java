import java.util.*;
class reverseword
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String m[]=s1.split(" ");
/*for(String t:m){
System.out.print(t);
}*/
for(int i=m.length-1;i>=0;i--){
System.out.print(m[i]+" ");
}
}
}
