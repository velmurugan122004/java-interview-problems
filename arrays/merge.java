import java.util.*;
class merge
{
static void merge(int arr1[],int arr2[])
{
int arr3[]=new int[arr1.length+arr2.length];
for(int i=0;i<arr1.length;i++)
{
arr3[i]=arr1[i];
}
for(int j=0;j<arr2.length;j++)
{
arr3[arr1.length+j]=arr2[j];
}
for(int y:arr3)
{
System.out.print(y+" ");
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER FIRST ARRAY SIZE:");
int n1=s.nextInt();
int arr1[]=new int[n1];
for(int i=0;i<n1;i++)
{
arr1[i]=s.nextInt();
}
System.out.print("ENTER SECOND ARRAY SIZE:");
int n2=s.nextInt();
int arr2[]=new int[n2];
for(int i=0;i<n2;i++)
{
arr2[i]=s.nextInt();
}
merge(arr1,arr2);
}
}