import java.util.*;
class Node {
int data;
Node next;
Node(int data)
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
public void insertbeg(int data)
{
Node n=new Node(data);
n.next=head;
head=n;
}
public void insertspecific(int data,int pos)
{
Node n=new Node(data);
Node temp=head;
for(int i=0;i<pos-1;i++)
{
temp=head.next;
}
n.next=temp.next;
temp.next=n;
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
}
class singlelinkedlistallinsertion
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
linkedlist l=new linkedlist();
l.insertend(10);
l.insertend(20);
l.insertend(30);
System.out.println("BEFORE INSERTION LINKEDLIST");
l.display();
System.out.println("NOW WE CAN CREATE SINGLE LINKEDLIST AT INSERTION");
System.out.println("INSERTION AT END ENTER 1");
System.out.println("INSERTION AT BEGING ENTER 2");
System.out.println("INSERTION AT SPECIFIC ENTER 3");
System.out.print("ENTER YOUR CHOICE :");
int choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER DATA :");
int n1=s.nextInt();
l.insertend(n1);
l.display();
break;
case 2:
System.out.print("ENTER DATA :");
int n2=s.nextInt();
l.insertbeg(n2);
l.display();
break;
case 3:
System.out.print("ENTER DATA :");
int n3=s.nextInt();
System.out.print("ENTER POSITION OF INSERT :");
int pos=s.nextInt();
l.insertspecific(n3,pos);
l.display();
break;
default:
System.out.print("CHECK YOUR ENTER CHOICE");
break;
}
}
}

