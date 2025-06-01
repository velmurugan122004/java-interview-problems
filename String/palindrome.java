import java.util.*;
class palindrome{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
s1=s1.toLowerCase();
int i=0,j=s1.length()-1;
int c=-1;
while(i!=j)
{
if(s1.charAt(i)==s1.charAt(j)){
c=0;
i++;
j--;
}
else{
c=-1;
break;
}
}
if(c!=-1){
System.out.print("palindrome");
}
else{
System.out.print("Not palindrome");
}
}
}
