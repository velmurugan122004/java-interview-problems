import java.util.*;
class Node
{
int data;//default value int 0;
Node next;//default value null;
Node(int data)
{
this.data=data;
}
}
class Linkedlist
{
Node head,tail;//default both null;
public void insert(int data)
{
Node n=new Node(data);
n.next=null;
if(head==null){
head=n;
tail=n;
}
else{
tail.next=n;
tail=n;
}
}
public void display()
{
System.out.println("DISPLAY SINGLE LINKEDLIST");
Node temp=head;
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
public void insertspecific(int pos,int data)
{
Node n=new Node(data);
Node temp=head;
for(int i=0;i<pos-1;i++){
   temp=temp.next;
}
n.next=temp.next;
temp.next=n;
}
}
public class singlelinkedlistinsertspecific{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Linkedlist l=new Linkedlist();
l.insert(s.nextInt());
l.insert(s.nextInt());
l.insert(s.nextInt());
l.insert(s.nextInt());
l.display();
l.insertspecific(2,15);
l.display();
}
}