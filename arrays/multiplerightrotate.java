import java.util.*;
class multiplerightrotate
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
System.out.print("ENTER NUMBER OF RIGHT ROTATION:");
int user=s.nextInt();
for(int p=0;p<=user;p++)
{
int temp=arr[n-1];
for(int j=n-1;j>0;j--)
{
arr[j]=arr[j-1];
}
arr[0]=temp;
}
for(int t:arr)
{
System.out.print(t);
}
}
}