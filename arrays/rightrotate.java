import java.util.*;
class rightrotate
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER ARRAY SIZE:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
int temp=arr[n-1];
for(int j=n-1;j>0;j--)
{
arr[j]=arr[j-1];
}
arr[0]=temp;
for(int t:arr)
{
System.out.print(t);
}
}
}