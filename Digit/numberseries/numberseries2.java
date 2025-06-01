import java.util.*;
class numberseries2
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMBER FOR SERIES:");
int n=s.nextInt();
int j=1;
for(int i=1;i<=n;i++)
{
if(i%2!=0)
{
System.out.print(i+1);
System.out.print(" ");
}
else
{
System.out.print(Math.pow(i-j,2)+" ");
j++;
}
}
}
}


