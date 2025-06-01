import java.util.*;
class leftrotate
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE ARRAY SIZE: ");
int n=s.nextInt();
int arr[]=new int [n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
int temp=arr[0];
for(int j=0;j<len-1;j++)
{
arr[j]=arr[j+1];
}
arr[len-1]=temp;
for(int t:arr)
{
System.out.print(t);
}
}
}
