import java.util.*;
class deletearrayindex
{
public static void main(String ar[])
{
Scanner s= new Scanner(System.in);
System.out.print("ENTER THE SIZE OF THE ARRAY:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
System.out.print("ENTER DELETE INDEX:");
int index=s.nextInt();
int len=arr.length;
for(int j=index;j<len-1;j++)
{
arr[j]=arr[j+1];
}
for(int t=0;t<n-1;t++)
{
System.out.print(arr[t]+" ");
}
}
}

