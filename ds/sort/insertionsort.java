import java.util.*;
class insertionsort
{
public static void sort(int[] arr)
{
int temp;
for(int i=1;i<arr.length;i++)
{
temp=arr[i];
int j=i-1;
while(j>=0 && arr[j]>temp)
{
arr[j+1]=arr[j];
j--;
}
arr[i]=temp;
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF THE ARRAY :");
int size=s.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=s.nextInt();
}
sort(arr);
/*for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+ " ");
}*/
System.out.print(Arrays.toString(arr));
}
}
