import java.util.*;
class merge2
{
static int[] create(int num)
{
Scanner s=new Scanner(System.in);
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=s.nextInt();
}
return arr;
}
static int[] merge(int arr1[],int arr2[])
{
int len1=arr1.length,len2=arr2.length;
int arr3[]=new int[len1+len2];
for(int i=0;i<len1;i++)
{
arr3[i]=arr1[i];
}
for(int j=0;j<len2;j++)
{
arr3[arr1.length+j]=arr2[j];
}
for(int y:arr3)
{
System.out.print(y+" ");
}

return arr3;
}
static void sort(int arr[])
{
int len=arr.length;
int arr1[]=new int[len];
int k=0;
for(int i=0;i<len-1;i++)
{
if(arr[i]<arr[i+1])
{
arr1[k]=arr[i];
k++;
}
else if(arr[i]>arr[i])
{
arr1[k]=arr[i];
k++;
}
else
{
arr1[k]=arr[i];
k++;
}
}
for(int u:arr1)
{
System.out.print(u);
}

}
public static void main(String ar[])
{
Scanner s1=new Scanner(System.in);
System.out.print("ENTER THE FIRST ARRAY SIZE:");
int n1=s1.nextInt();
int array1[]=create(n1);
System.out.print("ENTER THE SECOND ARRAY SIZE:");
int n2=s1.nextInt();
int array2[]=create(n2);
int mergearray[]=merge(array1,array2);
sort(mergearray);
}
}
