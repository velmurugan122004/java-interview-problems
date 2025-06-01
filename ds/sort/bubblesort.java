import java.util.*;
class bubblesort
{
public static int[] sortarray(int arr[])
{
for(int i=0;i<arr.length;i++)
{
for(int j=i;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
return arr;
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE SIZE OF THE ARRAY : ");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
int[] sort=sortarray(arr);
for(int i=0;i<arr.length;i++)
{
System.out.print(sort[i] +" ");
}
}
}
