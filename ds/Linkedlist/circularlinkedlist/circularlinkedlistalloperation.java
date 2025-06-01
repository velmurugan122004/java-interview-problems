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
class linkedlist
{
Node head,tail;
public void insertbeg(int data)
{
Node n=new Node(data);
if(head==null)
{
head=n;
tail=n;
n.next=head;
}
else
{
n.next=head;
head=n;
tail.next=head;
}
}
public void insertend(int data)
{
Node n=new Node(data);
if(head==null)
{
head=n;
tail=n;
n.next=head;
}
else
{
tail.next=n;
tail=n;
n.next=head;
}
}
public void insertspecific(int data,int pos)
{
Node n=new Node(data);
Node temp=head;
if(head==null)
{
head=n;
tail=n;
}
else
{
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
n.next=temp.next;
temp.next=n;
}
}
public void display()
{
Node temp=head;
if(temp==null)
{
System.out.println("EMPTY LIST......PLEASE INSERT OPTION TO INSERT ELEMENT");
}
else
{
do{
System.out.println(temp.data+"<-"+temp.next);
temp=temp.next;
}while(temp!=head);
}
}
public void deletebeg()
{
if(head==null)
{
System.out.print("ALREADY LIST IS EMPTY");
}
else if(head==tail)
{
head=null;
tail=null;
}
else
{
head=head.next;
tail.next=head;
}
}
public void deleteend()
{
if(head==null)
{
System.out.print("ALREADY LIST IS EMPTY");
}
else if(head==tail)
{
head=null;
tail=null;
}
else
{
Node temp=head;
while(temp.next!=tail)
{
temp=temp.next;
}
tail=temp;
temp.next=head;
}
}
public void deletespecific(int pos)
{
if(head==null)
{
System.out.print("ALREADY LIST IS EMPTY");
}
else
{
Node temp=head;
for(int i=0;i<pos-2&temp.next!=head;i++)
{
temp=temp.next;
}
if(temp.next==tail)
{
tail=temp;
tail.next=head;
}
else
{
temp.next=temp.next.next;
}
}
}
}
class circularlinkedlistalloperation
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
System.out.println("CIRCULAR LINKEDLIST ALL OPRATION");
while(choice<=8)
{
System.out.println("* INSERT ELEMENT FIRST IN LINKEDLIST -ENTER '1'");
System.out.println("* INSERT ELEMENT LAST IN LINKEDLIST -ENTER '2'");
System.out.println("* INSERT ELEMENT SPECIFIC IN LINKEDLIST -ENTER '3'");
System.out.println("* DELETE ELEMENT FIRST IN LINKEDLIST -ENTER '4'");
System.out.println("* DELETE ELEMENT LAST IN LINKEDLIST -ENTER '5'");
System.out.println("* DELETE ELEMENT SPECIFIC IN LINKEDLIST -ENTER '6'");
System.out.println("* DISPLAYING IN LINKEDLIST -ENTER '7'");
System.out.println("* EXITING ....-ENTER '8'");
System.out.print("ENTER YOUR CHOICE:");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER DATA TO INSERT FIRST:");
l.insertbeg(s.nextInt());
break;
case 2:
System.out.print("ENTER DATA TO INSERT LAST:");
l.insertend(s.nextInt());
break;
case 3:
System.out.println("ENTER DATA TO INSERT SPECIFIC POSITION");
System.out.print("FIRST ENTER DATA,NEXT POSITION:");
l.insertspecific(s.nextInt(),s.nextInt());
break;
case 4:
System.out.print("DELETE FIRST ELEMENT IN LIST");
l.deletebeg();
break;
case 5:
System.out.print("DELETE LAST ELEMENT IN LIST");
l.deleteend();
break;
case 6:
System.out.print("DELETE SPECIFIC POSITION IN LIST");
l.deletespecific(s.nextInt());
break;
case 7:
System.out.println("DISPLAY LINKELIST");
l.display();
break;
case 8:
System.out.println("EXITING........");
System.exit(0);
break;
default:
System.out.println("YOUR CHOICE OUT OF LIST PLEASE CHECK YOUR CHOICE ");
break;
}
System.out.println();
}
}
}