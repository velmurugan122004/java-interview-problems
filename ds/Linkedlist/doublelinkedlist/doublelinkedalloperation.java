import java.util.*;
class Node
{
int data;
Node prev;
Node next;
Node (int data)
{
this.data=data;
}
}
class linkedlist
{
Node head,tail;
public void insert(int data)
{
Node n=new Node(data);
n.next=null;
n.prev=null;
if(head==null)
{
head=n;
tail=n;
}
else
{
tail.next=n;
n.prev=tail;
tail=n;
}
}
public void delete(int pos)
{
Node temp=head;
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
temp.next=temp.next.next;
}
public void display()
{
Node temp=head;
while(temp!=null)
{
System.out.print(temp.prev+"<-"+temp.data+"->"+temp.next+"   |   ");
temp=temp.next;
}
}
}
class doublelinkedalloperation
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
int choice=0;
while(choice<=4)
{
System.out.println("DOUBLE LINKEDLIST ALL OPERATION");
System.out.println("INSERT ELEMENT-ENTER '1'");
System.out.println("DELETE ELEMENT-ENTER '2'");
System.out.println("DELETE ELEMENT-ENTER '3'");
System.out.println("EXIT OPERATION-ENTER '4'");
System.out.print("ENTER YOUR CHOICE:");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER DATA :");
l.insert(s.nextInt());
break;
case 2:
System.out.print("ENTER DELETE POSITION :");
l.delete(s.nextInt());
break;
case 3:
l.display();
break;
case 4:
System.out.print("EXITING....");
System.exit(0);
break;
default:
System.out.print("CHECK YOUR ENTER CHOICE");
break;
}
}
}
}