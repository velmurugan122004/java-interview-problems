import java.util.*;
class Node
{
int data;
Node next;
Node (int data)
{
this.data=data;
}
}
class queueoperation
{
Node front,rear;
int length;
public void len(int length)
{
this.length=length;
}
public int sizeofqueue()
{ int size=0;
Node temp=front;
while(temp!=null)
{
temp=temp.next;
size++;
}
return size;
}
public Boolean isempty()
{
boolean check=false;
if(rear==null)
{
check=true;
}
return check;
}
public Boolean isfull()
{
boolean check=false;
if(sizeofqueue()>=length)
{
check=true;
}
return check;
}
public int enqueue(int data)
{
int check=-1;
if(!isfull())
{
check=0;
Node n=new Node(data);
n.next=null;
if(isempty())
{
front=n;
rear=n;
}
else
{
rear.next=n;
rear=n;
}
}
return check;
}
public int dequeue()
{
int check=0;
if(isempty())
{
System.out.println("YOUR QUEUE IS ALREADY EMPTY/QUEUE IS UNDERFLOW"); 
check=-1;
}
else
{
front=front.next;
}
return check;
}
public void peek()
{
if(rear==null)
{
System.out.println("YOUR QUEUE IS EMPTY");
}
else
{
System.out.println("DISPLAY TOP OF THE ELEMENT :"+front.data);
}
}
public void display()
{
System.out.println("DISPLAY QUEUE ELEMENTS");
Node temp=front;
if(temp==null)
{
System.out.println("QUEUE IS EMPTY");
}
else
{
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
}
}
class queueusinglinkedlist
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
queueoperation q=new queueoperation();
System.out.print("ENTER QUEUE SIZE:");
int n=s.nextInt();
q.len(n);
while(choice<=7)
{
System.out.println("QUEUE USING LINKEDLIST  IN ALL OPERATION");
System.out.println("* ENQUEUE OPERATION-ENTER -'1'-");
System.out.println("* DEQUEUE OPERATION-ENTER -'2'-");
System.out.println("* DISPLAY TOP ELEMENT-ENTER -'3'-");
System.out.println("* DISPLAY OPERATION-ENTER -'4'-");
System.out.println("* CHECK QUEUE IS EMPTY OR NOT -ENTER -'5'-");
System.out.println("* CHECK QUEUE IS FULL OR NOT -ENTER -'6'-");
System.out.println("* EXITING......-ENTER '7'");
System.out.print("ENTER YOUR OPTION :");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER YOUR INSERT ELEMENT:");
if(q.enqueue(s.nextInt())==-1)
{
System.out.println("YOUR QUEUE IS ALREADY FULL/QUEUE IS OVERFLOW");
System.exit(0);
break;
}
else
{
break;
}
case 2:
if(q.dequeue()==-1)
{
System.exit(0);
break;
}
else
{
break;
}
case 3:
q.peek();
break;
case 4:
q.display();
break;
case 5:
if(q.isempty())
{
System.out.println("YOUR QUEUE IS EMPTY");
break;
}
else
{
System.out.println("YOUR QUEUE IS NOT EMPTY SO DELETE ELEMENT");
break;
}

case 6:
if(q.isfull())
{
System.out.println("YOUR QUEUE IS FULL ");
break;
}
else
{
System.out.println("YOUR QUEUE IS NOT FULL SO INSERT ELEMENT");
break;
}
case 7:
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
