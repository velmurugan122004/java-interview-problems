import java.util.*;
class stack 
{
int top=-1,top1=-1;
char arr[]=new char[50];
int arr1[]=new arr1[50];
public void push(char data)
{
top++;
arr[top]=data;
}
public void push1(int data)
{
top1++;
arr1[top1]=data;
}
public char pop()
{
char c=arr[top];
top--;
return c;
}
public int pop1()
{
int c=arr1[top];
top1--;
return c;
}
public int calculate(int n1,int n2,char c)
{
int op=0;
switch(c)
{
case '+':
op=n1+n2;
break;
case '-':
op=n1-n2;
break;
case '*':
op=n1*n2;
break;
case '/':
op=n1/n2;
break;
}
public void evaluateprefix()
{
int count=top;
for(int i=0;i<top;i++)
{
char c=pop();
int n2=pop1();
int n1=pop1();
int cal=calculate(n1,n2,c);
push1(cal);
}
}
}
class evalateprefixoperation
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
stack sb=new stack();
System.out.println("EVALUATE/POSTFIX OPERATION");
System.out.println();
System.out.print("ENTER SIZE OF PREFIX EXPRESSION(EX:- 2 10)SIZE-3" : );
int size=s.nextInt();
System.out.print("ENTER PREFIX EXPRESSION:);
for(int i=0;i<size;i++)
{
String s1=s.next();
int c=Integer.parseInt(s1);
if(c>='0' && c<='9')
{
sb.push1(c);
}
else{
char d=s1.charAt(0);
sb.push(d);
}
}
sb.evaluateprefix();
}
}