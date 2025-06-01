import java.util.*;
class secondmin
{
public static void main(String ar[])
{
Scanner s1=new Scanner (System.in);
int n=s1.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s1.nextInt();
}
int len=arr.length,s=arr[0],min=arr[0];
for(int j=1;j<len;j++)
{
if(min>arr[j])
{
s=min;
min=arr[j];
}
else if(s>arr[j] &&  arr[j]!=min)
{
s=arr[j];
}
}
System.out.print("SECOND MINIMUM OF ARRAY:"+s);
}
}
