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
head.prev=null;
}
else{
n.prev=tail;
tail.next=n;
tail=n;
}
}
public void insertspecific(int data,int pos)
{
pos-=1;
Node n=new Node(data);
Node temp=head;
for(int i=0;i<pos-1;i++)
{
temp=temp.next;
}
n.next=temp.next;
n.prev=temp;
temp.next=n;
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
class doublelinkedlistinsertspecific
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
System.out.print("DISPLAY BEFORE INSERTION SPECIFIC");
l.display();
l.insertspecific(50,3);
System.out.print("DISPLAY AFTER INSERTION SPECIFIC");
l.display();
}
}