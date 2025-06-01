import java.util.*;
class binarysearch
{
public static Boolean search(int arr[],int val)
{
int mid,first,last;
//Arrays.sort(arr);
first=0;
last=arr.length-1;	
while(first<=last)
{
mid=(first+last)/2;
if(val==arr[mid])
{
return true;
}
else if(val<mid)
last=mid-1;
else if(val>mid)
first=mid+1;
}
return false;
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF THE ARRAY : ");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.print("ENTER SEARCH ELEMENT:");
int v=s.nextInt();
if(search(arr,v))
{
System.out.println("ELEMENT FOUND");
}
else 
{
System.out.println("ELEMENT NOT FOUND");
}
}
}