import java.util.*;
class arrayinsertupdatedelete{
public static void display(int a[])
{
System.out.print("[");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.print("]");
}
public static void search(int ind,int arr[])
{
ind-=1;
int no=-1;
for(int i=0;i<arr.length;i++)
{
if(ind==i){
no=0;
}
}
if(no!=0)
{
System.out.print("CHECK YOUR INDEX VALUE THAT CAN BE ABOVE ARRAY INDEX");
}
else{
ind+=1;
System.out.println("VALUE OF "+ind+" Position:"+arr[ind-1]);
}
}
public static void delete(int del,int arr[])
{
del-=1;
for(int i=0;i<arr.length;i++)
{
if(i==del){
arr[del]=0;
}
}
}
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER THE ARRAY LENGTH:");
int size=s.nextInt();
int arr[]=new int[size];
System.out.println("DISPLAY ARRAY BEFORE ADDING ELEMENT");
display(arr);
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("ADDING ARRAY ELEMENT IN INDEX ");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
for(int i=0;i<size;i++)
{
System.out.print("ADDING ELEMENT AT "+i+" INDEX:");
arr[i]=s.nextInt();
}
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("DISPLAY ARRAY AFTER ADDING ELEMENT");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
display(arr);
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("UPDATE ARRAY ELEMENT");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.print("ENTER WHICH POSITION UPDATE:");
int pos=s.nextInt();
System.out.print("ENTER VALUE AT "+pos+" POSITION:");
arr[pos-1]=s.nextInt();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("DISPLAY ARRAY AFTER UPDATE ELEMENT");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
display(arr);
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("SEARCH ELEMENT WITH USER POSITION:");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.print("ENTER POSITION:");
search(s.nextInt(),arr);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println("DELETE ELEMENT WITH USER POSITION IN ARRAY");
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.print("ENTER POSITION YOU CAN DELETE VALUE IN ARRAY:");
int del=s.nextInt();
delete(del,arr);
System.out.println("DISPLAY AFTER DELETE VALUE IN "+del+" POSITION");
display(arr);
}
}



