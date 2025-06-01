import java.util.*;
class CountString{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
System.out.print("Enter String:"); 
String s1=s.nextLine();
int c1=0,c2=0,c3=0,c4=0;
for(char c:s1.toCharArray())
{
if(c ==' '){
c1++;
}
else if(c>=47 && c<=57){
c2++;
}
else if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ){
c3++;
}
else if((c>=65 && c<=90)||(c>=97 && c<=122))
{
c4++;
}
}
System.out.println("Space Count of Given String:"+c1);
System.out.println("Number Count of Given String:"+c2);
System.out.println("Vowels Count of Given String:"+c3);
System.out.print("Alphabet Count of Given String:"+c4);
}
}