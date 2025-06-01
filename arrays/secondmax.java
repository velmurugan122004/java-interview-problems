import java.util.*;
class secondmax
{
public static void main(String ar[])
{
Scanner s1=new Scanner (System.in);
System.out.print("ENTER ARRAY SIZE:");
int n=s1.nextInt();
int arr[]=new int[n];
for (int i=0;i<n;i++)
{
arr[i]=s1.nextInt();
}
int s=0,max=0;
int len=arr.length;
for(int j=0;j<len;j++)
{
if(max<arr[j])
{
s=max;
max=arr[j];
}
else if(s<arr[j]&& arr[j]!=max)
{
s=arr[j];
}
}
System.out.print("SECOND MAXIMUM OF ARRAY:"+s);
}
}


