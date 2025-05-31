import java.util.*;
class vels
{
static int [] sort(int arr[])
{
int len=arr.length;
for(int i=0;i<len;i++)
{
int j,temp;
for(j=0;j<len-1-i;j++)
{
if(arr[i]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}}
return arr;
}
static void merge(int arr1[],int arr2[])
{
int n1=arr1.length, n2=arr2.length,n3;
n3=n1+n2;
int arr3[]=new int[n3];
int i=0,j=0,k=0;
for(i=0;i<n3;i++)
{
if(arr1[j]<arr2[k])
{
arr3[i]=arr1[j];
j++;
}
else
{
arr3[k]=arr2[j];
k++;
}
for(int o:arr3)
{
System.out.println(arr3+" ");
}
}
}
static int[] createarray(int size)
{ Scanner s=new Scanner(System.in);
int arr[]=new int[size];
for( int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
return arr;
}

public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
System.out.println("enter first array size:");
int size1=s1.nextInt();
int ar1[]=createarray(size1);
int arr1[]=sort(ar1);
System.out.println("enter second array size:");
int size2=s1.nextInt();
int ar2[]=createarray(size2);

int arr2[]=sort(ar2);
merge(arr1,arr2);
}
}
