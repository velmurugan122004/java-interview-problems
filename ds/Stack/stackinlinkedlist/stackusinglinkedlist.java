import java.util.*;
class Node{
int data;
Node next;
Node(int data)
{
this.data=data;
}
}
class stacklinkedlist
{
Node top;
public void push(int data)
{
Node n=new Node(data);
n.next=top;
top=n;
}
public int pop()
{
int check=0;
if(top==null)
{
check=-1;
}
else{
System.out.print("POPPED ELEMENT IS:"+top.data);
top=top.next;
check=0;
}
return check;
}
public void peek()
{
if(top==null)
{
System.out.print("STACK IS EMPTY SO DOSEN'T TOP OF THE ELEMENT");
}
else{
System.out.print("TOP ELEMENT IN STACK IS:"+top.data);
}
}
public void display()
{
Node temp=top;
System.out.println("DISPLAY STACK ELEMENT");
while(temp!=null)
{
System.out.println(temp.data);
temp=temp.next;
}
}
}
class stackusinglinkedlist
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
stacklinkedlist sl=new stacklinkedlist();
while(choice<=5)
{
System.out.println("STACK USING ARRAY  IN ALL OPERATION");
System.out.println("PUSH OPERATION-ENTER '1'");
System.out.println("POP OPERATION-ENTER '2'");
System.out.println("DISPLAY TOP ELEMENT-ENTER '3'");
System.out.println("DISPLAY OPERATION-ENTER '4'");
System.out.println("EXITING......-ENTER '5'");
System.out.println("ENTER YOUR OPTION");
choice=s.nextInt();
switch(choice)
{
case 1:
sl.push(s.nextInt());
break;
case 2:
if(sl.pop()==-1)
{
System.out.println("STACK IS UNDERFLOW/STACK ALREADY EMPTY DOSEN'T REMOVE ANY ELEMENT");
System.exit(0);
break;
}
else{
break;
}
case 3:
sl.peek();
break;
case 4:
sl.display();
break;
case 5:
System.out.println("EXITING.........");
System.exit(0);
break;
default :
System.out.println("YOUR CHOICE EXITING LIMIT PLEASE CHECK YOUR CHOICE");
break;
}
System.out.println();
}
}
}
