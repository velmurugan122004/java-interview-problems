import java.util.*;
class arrayqueue
{
int front,rear,size;
int arr[];
public void createqueue(int size)
{
arr=new int[size];
front=rear=-1;
}
public int enqueue(int data)
{
int check=0;
if(rear==arr.length-1)
{
System.out.println("YOUR QUEUE IS FULL/QUEUE IS OVERFLOW");
check=-1;
}
else if(rear==-1 && front==-1)
{
rear=0;
front=0;
arr[rear]=data;
}
else
{
arr[rear++]=data;
}
return check;
}
public int dequeue()
{
int check=0;
if(rear==-1 && front==-1)
{
System.out.println("YOUR QUEUE IS EMPTY/QUEUE IS UNDERFLOW");
check=-1;
}
else if(rear == front)
{
System.out.println("POPPED ELEMENT IS:"+arr[front]);
front=-1;
rear=-1;
}
else
{
System.out.println("POPPED ELEMENT IS:"+arr[front++]);
}
return check;
}
public void peek()
{
if(rear==-1 && front==-1)
{
System.out.println("YOUR QUEUE IS EMPTY");
}
else
{
System.out.println(arr[front]);
}
}
public void display()
{
if(rear==-1 && front==-1)
{
System.out.println("YOUR QUEUE IS EMPTY");
}
else
{
for(int i=front;i<=rear;i++)
{
System.out.println(arr[i]);
}
}
}
}
class queueusingarray
{
public static void main(String ar[])
{
String choice="0";
Scanner s=new Scanner(System.in);
arrayqueue q=new arrayqueue();
System.out.print("ENTER QUEUE SIZE ,SIZE IS FIXED:");
int size=s.nextInt();
q.createqueue(size);
while(choice<="5")
{
System.out.println("QUEUE USING ARRAY  IN ALL OPERATION");
System.out.println("ENQUEUE OPERATION-ENTER '1'");
System.out.println("DEQUEUE OPERATION-ENTER '2'");
System.out.println("DISPLAY TOP ELEMENT-ENTER '3'");
System.out.println("DISPLAY OPERATION-ENTER '4'");
System.out.println("EXITING......-ENTER '5'");
System.out.println("ENTER YOUR OPTION");
choice=s.nextLine();
switch(choice)
{
case "1":
System.out.print("ENTER YOUR INSERT ELEMENT:");
if(q.enqueue(s.nextInt())==-1)
{
System.exit(0);
break;
}
else
{
break;
}
case "2":
if(q.dequeue()==-1)
{
System.exit(0);
break;
}
else
{
break;
}
case "3":
System.out.prinln("DISPLAY YOUR FIRST INSERTED ELEMENT");
q.peek();
break;
case "4":
System.out.prinln("DISPLAY YOUR QUEUE ELEMENTS");
q.display();
break;
case "5":
System.out.println("EXITING...............");
System.exit(0);
break;
default :
System.out.println("YOUR CHOICE IS OUT OF OPTION BETTER LUCK NEXT TIME");
System.exit(0);
break;
}
System.out.println();
}
}
}