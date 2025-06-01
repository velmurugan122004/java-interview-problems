import java.util.*;
class deletearrayvalue
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF THE ARRAY:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
System.out.print("ENTER DELETE VALUE :");
int val=s.nextInt();
for(int j=0;j<len;j++)
{
if(arr[j]==val)
{
for(int k=j;k<len-1;k++)
{
arr[k]=arr[k+1];
}
}
}
for(int l=0;l<len-1;l++)
{
System.out.print(arr[l]+" ");
}
}
}