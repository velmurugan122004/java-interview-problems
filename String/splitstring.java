import java.util.*;
class splitstring{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
for(char t:s1.toCharArray())
{
if(t!=' '){
System.out.print(t);
}
}
}
}