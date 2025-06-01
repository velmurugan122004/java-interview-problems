import java.util.*;
class maxarray
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF ARRAY:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
int max=0;
for(int j=0;j<len;j++)
{
if(max<arr[j])
{
max=arr[j];
}
}
System.out.print("MAXIMUM IN ARRAY:"+max);
}
}
