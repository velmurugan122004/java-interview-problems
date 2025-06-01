import java.util.*;
class thirdmin
{
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
int n=s1.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s1.nextInt();
}
int len=arr.length,t=0,s=0,min=arr[0];
for(int j=1;j<len;j++)
{
if(min>arr[j])
{
t=s;
s=min;
min=arr[j];
}
else if(s<arr[j] && arr[j]!=min)
{
t=s;
s=arr[j];
}
else if(t<arr[j] && arr[j]!=min && arr[j]!=s)
{
t=arr[j];
}
}
System.out.print("THIRD MINIMUM OF GIVEN ARRAY:"+t);
}
}

