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
class linkedlist
{
Node head,tail;
public void insert(int data)
{
Node n=new Node(data);
n.prev=null;
n.next=null;
if(head==null)
{
head=n;
tail=n;
}
else{
tail.next=n;
n.prev=tail;
tail=n;
}
}
public void forwardtraversal()
{
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
public void backwardtraversal()
{
Node temp=tail;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.prev;
}
}
}
class doublelinkedlisttraversal
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.insert(50);
System.out.println(" DISPLAY FORWARD TRAVERSAL");
l.forwardtraversal();
System.out.println(" DISPLAY BACKWARD TRAVERSAL");
l.backwardtraversal();
}
}