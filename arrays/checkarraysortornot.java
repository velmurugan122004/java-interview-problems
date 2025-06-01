import java.util.*;
class checkarraysortornot
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE ARRAY SIZE:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int c=0;
for(int j=0;j<n-1;j++)
{
if(arr[j]<arr[j+1])
{
c++;
}
else
{
break;
}
}
if(c==n-1)
{
System.out.print("GIVEN ARRAY IS SORTED");
}
else
{
System.out.print("GIVEN ARRAY IS NOT SORTED");
}
}
}