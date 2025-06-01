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
class linkedlist
{
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
else{
tail.next=n;
n.next=head;
tail=n;
}
}
public void display()
{
System.out.println(tail.next);
Node temp=head;
while(true)
{
System.out.println(temp.data+"<-"+temp.next);
temp=temp.next;
if(head==temp.next)
{
System.out.println(temp.data+"<-"+temp.next);
break;
}
}
}
}

class circularlinkedlist
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
Scanner s=new Scanner(System.in);
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.display();
}
}