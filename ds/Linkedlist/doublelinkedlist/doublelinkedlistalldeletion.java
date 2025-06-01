import java.util.*;
class Node
{
int data;
Node next;
Node prev;
Node(int data)
{
this.data=data;
}
}
class linkedlist{
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
n.prev=tail;
tail.next=n;
tail=n;
}
}
public void deleteend()
{
tail=tail.prev;
tail.next=null;
}
public void deletefirst()
{
head=head.next;
head.prev=null;
}
public void deletespecific(int pos)
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
System.out.println(temp.prev+"<-"+temp.data+"->"+temp.next);
temp=temp.next;
}
}
}
class doublelinkedlistalldeletion
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.insert(50);
System.out.println("BEFORE DELETION LINKEDLIST");
l.display();
System.out.println("NOW WE CAN CREATE SINGLE LINKEDLIST AT DELETION");
System.out.println("DELETION AT END ENTER 1");
System.out.println("DELETION AT BEGING ENTER 2");
System.out.println("DELETION AT SPECIFIC ENTER 3");
System.out.print("ENTER YOUR CHOICE :");
int choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER DATA :");
l.deleteend();
l.display();
break;
case 2:
System.out.print("ENTER DATA :");
l.deletefirst();
l.display();
break;
case 3:
System.out.print("ENTER POSITION OF DELETE :");
int pos=s.nextInt();
l.deletespecific(pos);
l.display();
break;
default:
System.out.print("CHECK YOUR ENTER CHOICE");
break;
}
}
}