import java.util.*;
import java.lang.*;
class array
{
static void array(int n)
{
Scanner s=new Scanner(System.in);
int arr[]=new int[n];
System.out.print("ENTER ARRAY NUMBER BASED ON "+n+" SIZE:");
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
System.out.print("DISPLAY USER ARRAY:{");
for(int j=0;j<len;j++)
{
System.out.print(arr[j]+ " ");
}
System.out.print("}");

}
public static void main(String ar[])
{
Scanner s1=new Scanner (System.in);
System.out.print("ENTER SIZE OF ARRAY:");
int size=s1.nextInt();
array(size);
}
}

