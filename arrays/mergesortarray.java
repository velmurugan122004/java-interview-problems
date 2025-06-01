import java.util.*;
class mergesortarray
{
static int[] sort(int arr[])
{
int len=arr.length;
for(int i=0;i<len;i++)
{
for(int j=1+i;j<len;j++)
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
static void merge(int arr1[],int arr2[])
{
int len1=arr1.length;
int len2=arr2.length;
int len3=len1+len2;
int arr3[]=new int[len3];
int i=0,j=0;
while(i<len1-1 && j<len2-1)
{
if(arr1[i]<arr2[j])
{
arr3[i]=arr1[i];
i++;
}
else if(arr1[i]>arr2[j])
{
arr3[i+j]=arr2[j];
j++;
}
else
{
arr3[i+j+i]=arr1[i];
i++;
}
}
System.out.print("MERGE TWO SORTED ARRAYS ARE:{");
for(int y:arr3)
{
System.out.print(y+" ");
}
System.out.print("}");
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF FIRST ARRAY:");
int size1=s.nextInt();
int arr1[]=new int[size1];
for(int i=0;i<size1;i++)
{
arr1[i]=s.nextInt();
}
int sortarray1[]=sort(arr1);
for(int y:sortarray1)
{
System.out.print(y+" ");
}
System.out.print("ENTER SIZE OF second ARRAY:");
int size2=s.nextInt();
int arr2[]=new int[size2];
for(int i=0;i<size2;i++)
{
arr2[i]=s.nextInt();
}
int sortarray2[]=sort(arr2);
for(int y:sortarray2)
{
System.out.print(y+" ");
}
merge(sortarray1,sortarray2);
}
}
