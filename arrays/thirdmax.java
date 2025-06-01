import java.util.*;
class thirdmax
{
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int arr[]=new int[n];
for(int j=0;j<n;j++)
{
arr[j]=s1.nextInt();
}
int s=0,t=0,max=0;
int len=arr.length;
for(int i=0;i<len;i++)
{
if(max<arr[i])
{
t=s;
s=max;
max=arr[i];
}
else if(s<arr[i] && arr[i]!=max)
{
t=s;
s=arr[i];
}
else if(t<arr[i] && arr[i]!=max && arr[i]!=s)
{
t=arr[i];
}
}
System.out.print("THIRD MAXIMUM:"+t);
}
}


