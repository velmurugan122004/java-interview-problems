import java.util.*;
class reversearray
{
public static void main(String ar[])
{
Scanner s=new Scanner (System.in);
int n=s.nextInt();
int arr[]=new int[n];
int b[]=new int [n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
int k=0;
for(int j=len-1;j>=0;j--)
{
b[k]=arr[j];
k++;
}
for(int y:b)
{
System.out.print(y+" ");
}
}
}
