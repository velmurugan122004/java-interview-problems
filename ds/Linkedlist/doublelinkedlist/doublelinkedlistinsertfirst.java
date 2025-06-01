class Node
{
int data;
Node prev,next;
Node(int data)
{
this.data=data;
}
}
class linkedlist{
Node head,tail;
public void insertfirst(int data)
{
Node n=new Node(data);
n.next=null;
n.prev=null;
if(head==null)
{
head=n;
tail=n;
head.prev=null;
}
else{
n.next=head;
head.prev=n;
head=n;
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
class doublelinkedlistinsertfirst{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insertfirst(10);
l.insertfirst(20);
l.insertfirst(30);
l.insertfirst(40);
l.display();
}
}

