class Node
{
int data;
Node next;
Node(int d)
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
public void deletespecific(int pos)
{
Node temp=head;
for(int i=0;i<pos-2;i++)
{
temp=temp.next;
}
temp.next=temp.next.next;
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
class singlelinkedlistdeletespecific
{
public static void main(String ar[])
{
linkedlist l=new linkedlist();
l.insert(10);
l.insert(20);
l.insert(30);
l.insert(40);
System.out.println("DISPLAY BEFORE DELETE LINKEDLIST");
l.display();
l.deletespecific(2);
System.out.println("DISPLAY AFTER DELETE LINKEDLIST");
l.display();
}
}
