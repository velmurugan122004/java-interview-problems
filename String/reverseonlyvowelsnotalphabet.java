import java.util.*;
class reverseonlyvowelsnotalphabet{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
String s2=new String();
for(int i=0;i<s1.length();i++)
{
char c=s1.charAt(i);
if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U')
{
s2+=c;
}
}
int j=s2.length()-1;
for(int i=0;i<s1.length();i++)
{
char c=s1.charAt(i);
if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U'){
System.out.print(s2.charAt(j--));
}
else{
System.out.print(s1.charAt(i));
}
}
}
}



 