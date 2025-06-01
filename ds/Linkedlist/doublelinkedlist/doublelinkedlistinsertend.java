class Node{
int data;
Node prev,next;
Node (int data)
{
this.data=data;
}
}
class linkedlist{
Node head,tail;
public void insertend(int data)
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
n.prev=tail;
tail.next=n;
tail=n;
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
class doublelinkedlistinsertend{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insertend(10);
l.insertend(20);
l.insertend(30);
l.insertend(40);
l.display();
}
}

