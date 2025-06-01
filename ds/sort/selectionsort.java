import java.util.*;
class selectionsort
{
public static void sort(int[] arr)
{
for(int i=0;i<arr.length;i++)
{
int min=i;
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
min=j;
}
int temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}
System.out.println("AFTER SORTING ARRAY:-");
System.out.print(Arrays.toString(arr));
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE SIZE OF THE ARRAY :");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
System.out.println("BEFORE SORTING ARRAY:-");
System.out.println(Arrays.toString(arr));
System.out.println();
sort(arr);
}
}