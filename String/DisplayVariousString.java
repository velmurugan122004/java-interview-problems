import java.util.*;
class DisplayVariousString{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter String:"); 
String s1=s.nextLine();
String c1=new String();
String c2=new String();
String c3=new String();
String c4=new String();
for(char c:s1.toCharArray())
{
if(c ==' '){
c1+='_';
}
else if(c>=47 && c<=57){
c2+=c;
}
else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
c3+=c;
}
else if((c>=65 && c<=90)||(c>=97 && c<=122))
{
c4+=c;
}
}
System.out.println("Space Count of Given String:"+c1);
System.out.println("Number Count of Given String:"+c2);
System.out.println("Vowels Count of Given String:"+c3);
System.out.print("Alphabet Count of Given String:"+c4);
}
}