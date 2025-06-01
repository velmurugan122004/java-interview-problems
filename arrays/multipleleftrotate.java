import java.util.*;
class multipleleftrotate
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
int len=arr.length,temp;
System.out.print("ENTER NHUMBER OF LEFT ROTATION:");
int nl=s.nextInt();
for(int k=0;k<nl;k++)
{
temp=arr[0];
for(int j=0;j<len-1;j++)
{
arr[j]=arr[j+1];
}
arr[len-1]=temp;
}
for(int t:arr)
{
System.out.print(t+" ");
}
}
}