import java.util.*;
class quicksort
{
public static void quick(int arr[],int low,int high)
{
if(low>=high)
{
return;
}
int start=low,end=high;
int mid=(start+end)/2;
int pivot=arr[mid];
while(start<=end)
{
while(arr[start]<pivot)
{
start++;
}
while(arr[end]>pivot)
{
end--;
}
if(start<=end)
{
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
start++;
end--;
}
}
quick(arr,low,end);
quick(arr,start,high);
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE ARRAY SIZE :");
int size=s.nextInt();
int arr[]=new int[size];
System.out.println("ENTER THE ELEMENT:");
for(int i=0;i<size;i++){
arr[i]=s.nextInt();
}
System.out.println("BEFORE SORTING :-");
System.out.println(Arrays.toString(arr));
quick(arr,0,arr.length-1);
System.out.println("AFTER SORTING :-");
System.out.println(Arrays.toString(arr));
}
}