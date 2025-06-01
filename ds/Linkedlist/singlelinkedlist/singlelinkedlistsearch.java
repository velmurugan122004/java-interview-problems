import java.util.*;
class Node{
int data;
Node next;
Node (int d)
{
this.data=d;
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
else
{
tail.next=n;
tail=n;
}
}
public void search(int target)
{
Node temp=head;
int found=0;
while(temp!=null)
{
if(temp.data==target)
{
found=1;
break;
}
else{
temp=temp.next;
}
}
if(found==1)
{
System.out.print("ELEMENT IS FOUND IN LINKEDLIST");
}
else{
System.out.print("ELEMENT IS NOT FOUND IN LINKEDLIST");
}
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
class singlelinkedlistsearch
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
System.out.print("ENTER ELEMENT TO BE SEARCH:");
int n=s.nextInt();
l.search(n);
}
}