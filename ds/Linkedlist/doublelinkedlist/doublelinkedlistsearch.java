import java.util.*;
class Node
{
int data;
Node next;
Node prev;
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
n.prev=tail;
tail.next=n;
tail=n;
}
}
public void search(int num)
{
int check=0;
Node temp=head;
while(temp.next!=null)
{
if(num==temp.data)
{
check=1;
break;
}
else{
temp=temp.next;
check=0;
}
}
if(check==0)
{
System.out.print("ELEMENT NOT FOUND");
}
else{
System.out.print("ELEMENT FOUND");
}
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
class doublelinkedlistsearch{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.insert(50);
int n=s.nextInt();
l.search(n);
}
}