import java.util.*;
class lin
{
public static Boolean search(int arr[],int f)
{
Boolean check=false;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==f)
{
check=true;
break;
}
}
return check;
}
}
class linearsearch
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER SIZE OF THE ARRAY :");
int size=s.nextInt();
int arr[]=new arr[size];
for(int i=0;i<n;i++)
{
arr[i]=s.nextint();
}
System.out.print("ENTER SEARCH ELEMENT :");
int se=s.nextInt();
if(search(arr,se))
{
System.out.println("ELEMENT FOUND ");
}
else
{
System.out.println("ELEMENT NOT FOUND");
}
}
}