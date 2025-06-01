import java.util.*;
class minarray
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER ARRAY SIZE:");
int n=s.nextInt();
int arr[]=new int[n];
System.out.print("ENTER ARRAY ELEMENT:");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int min=arr[0];
int len=arr.length;
for(int t=1;t<len;t++)
{
if(min>arr[t])
{
min=arr[t];
}
}
System.out.print("MINIMUM OF ARRAY:"+min);
}
}


