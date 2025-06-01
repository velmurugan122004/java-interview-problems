import java.util.*;
class Stack
{
int maxsize;
int arr[];
int top;
public void createstack(int size)
{
maxsize=size;
arr=new int[size];
top=-1;
}
public int push(int data)
{
int check=0;
if(top>=maxsize-1)
{
System.out.println("STACK IS OVERFLOW/STACK IS FULL DOSN'T INSERT ELEMENT");
check=-1;
}
else{
top++;
arr[top]=data;
check=0;
}
return check;
}
public int pop()
{
int check=0;
if(top<0)
{
System.out.println("STACK IS UNDERFLOW/YOUR STACK IS ALRAEDY EMPTY");
check=-1;
}
else{
System.out.println("POPPED ELEMENT IN STACK-"+arr[top]);
top--;
check=0;
}
return check;
}
public int peek()
{
int check=0;
if(top<0)
{
System.out.println("YOUR STACK IS EMPTY PLS INSERT ELEMENT THEN DISPLAY");
check=-1;
}
else
{
System.out.println("PEEK ELEMENT IN STACK/TOP ELEMENT IN STACK-"+arr[top]);
check=0;
}
return check;
}
public void display()
{
if(top==-1)
{
System.out.println("YOUR STACK IS EMPTY PLS INSERT ELEMENT THEN DISPLAY");
}
else
{
for(int i=top;i>=0;i--)
{
System.out.println(arr[i]);
}
}
}
}
class stackusingarray
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
System.out.println("CAREFULLY ENTER STACK SIZE FIXED:");
Stack st=new Stack();
st.createstack(s.nextInt());
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
if(st.push(s.nextInt())==-1)
{
System.exit(0);
break;
}
else{
break;
}
case 2:
if(st.pop()==-1)
{
System.exit(0);
break;
}
else{
break;
}
case 3:
if(st.peek()==-1)
{
System.out.println("STACK IS EMPTY SO DOSEN'T TOP OF THE ELEMENT");
break;
}
else{
break;
}
case 4:
st.display();
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