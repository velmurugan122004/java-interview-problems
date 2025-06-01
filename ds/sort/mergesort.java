package mypackage;
import java.util.*;
class mergesort{
public static void merge(int arr[])
{
if(arr.length<2)
{
return;
}
int mid=arr.length/2;
int lefthalf[]=new int[mid];
int righthalf[]=new int[arr.length-mid];
for(int i=0;i<mid;i++)
{
lefthalf[i]=arr[i];
}
for(int i=mid;i<arr.length;i++)
{
righthalf[i-mid]=arr[i];
}
//System.out.println("LH :"+Arrays.toString(lefthalf));
merge(lefthalf);
//System.out.println("RH :"+Arrays.toString(righthalf));
merge(righthalf);
/*System.out.println("AFTER COMPLETING DAC PROCESS");
//System.out.println("LEFTHALF :"+Arrays.toString(lefthalf));
//System.out.println("RIGHTHALF :"+Arrays.toString(righthalf));*/
mergesort(arr,lefthalf,righthalf);
}
public static void mergesort(int arr[],int left[],int right[])
{
//System.out.println("LEFTHALF :"+Arrays.toString(left));
//System.out.println("RIGHTHALF :"+Arrays.toString(right));
//System.out.println(Arrays.toString(arr));
int leftsize=left.length;
int rightsize=right.length;
int i=0,j=0,k=0;
while(i<leftsize && j<rightsize)
{
if(left[i]<=right[j])
{
arr[k]=left[i];
i++;
}
else
{
arr[k]=right[j];
j++;
}
k++;
}
while(i<leftsize || j<rightsize)
{
if(i<leftsize)
{
arr[k++]=left[i++];
}
else if(j<leftsize)
{
arr[k++]=right[j++];
}
}
//System.out.println("===="+Arrays.toString(arr));
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE SIZE  OF THE ARRAY :");
int size=s.nextInt();
int arr[]=new int[size];
System.out.println("ENTER THE ARRAY ELEMENT :");
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.println("BEFORE SORTING :-");
System.out.println(Arrays.toString(arr));
merge(arr);
System.out.println("AFTER SORTING :-");
System.out.print(Arrays.toString(arr));
}
}