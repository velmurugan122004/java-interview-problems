import java.io.*;
import java.util.*;
class array
{
public static void reverse()
{
Scanner sc=new Scanner(System.in);
int si=sc.nextInt();
int arr[]=new int[si];
int brr[]=new int[si];
int j=0;
for(int i=si-1;i>=0;i++)
{ 
 arr=sc.nextInt();
}
for(int i=si-1;i>=0;i++)
{
brr[j]=arr[i];
System.out.println(brr[j]);
j++;
}
}
public static void main(String ar[])
{
reverse();
}
}


