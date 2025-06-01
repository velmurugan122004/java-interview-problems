class Node 
{
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
public void deletefirst()
{
Node temp=head;
head=temp.next;
temp.next=null;
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
class singlelinkedlistdeletefirst
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
System.out.print("DISPLAY BEFORE DELETION LINKEDLIST");
l.display();
l.deletefirst();
System.out.print("DISPLAY AFTER DELETION LINKEDLIST");
l.display();
}
}