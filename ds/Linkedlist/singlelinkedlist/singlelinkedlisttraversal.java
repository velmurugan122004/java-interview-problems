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
tail=n;
}
}
public void forwardtraversal()
{
System.out.println("FORWARD TRAVERSAL OF LINKEDLIST");
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data+"->"+temp.next);
temp=temp.next;
}
}
public void backwardtraversal()
{
System.out.println("BACKWARD TRAVERSAL NOT SUPPORT IN SINGLELINKED LIST");
}
}
class singlelinkedlisttraversal
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
l.insert(50);
l.forwardtraversal();
l.backwardtraversal();
}
}