import java.util.*;
class Node
{
int dats;//default value int 0;
Node next;//default value null;
}
class linkedlist
{
Node head,tail;//default both null;
public void insert(int data)
{
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
Node temp=head;
while(temp!=null)
{
System.out.print(temp.data);
temp=temp.next;
}
}
}
public class singlelinkedlistinsertatend{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
LinkedList l=new Linkedlis();
l.insert(s.nextInt());
l.insert(s.nextInt());
l.insert(s.nextInt());
l.insert(s.nextInt());
l.display();
}
}
