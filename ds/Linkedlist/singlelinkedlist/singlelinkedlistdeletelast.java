import java.util.*;
class Node
{
int data;
Node next;
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
if(head==null)
{
head=n;
tail=n;
}
else
{
tail.next=n;
tail=n;
}
}
public void deletelast()
{
Node temp=head;
while(temp.next!=tail)
{
temp=temp.next;
}
temp.next=null;
tail=temp;
}
public void display()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
}
class singlelinkedlistdeletelast{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.insert(50);
System.out.println("BEFORE DELETION LINKEDLIST ELEMENT");
l.display();
l.deletelast();
System.out.println("AFTER DELETION LINKEDLIST ELEMENT");
l.display();
}
}

