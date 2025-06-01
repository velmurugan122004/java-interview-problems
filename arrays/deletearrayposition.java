import java.util.*;
class  deletearrayposition
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE SIZE OF THE ARRAY:");
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int len=arr.length;
System.out.print("USER ARRAY:");
System.out.print("{");
for(int y:arr)
{
System.out.print(y+" ");
}
System.out.print("}");
System.out.println();
System.out.print("ENTER DELETE NUMBER IN ABOVE USER ARRAY:");
int pos=s.nextInt();

for(int j=pos-1;j<len-1;j++)
{
arr[j]=arr[j+1];
}
for(int k=0;k<len-1;k++)
{
System.out.print(arr[k]+" ");
}
}
}