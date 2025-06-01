import java.util.*;
class stack
{
int top=-1;
int arr[]=new int[100];
public void push(int c)
{
top++;
arr[top]=c;
}
public int pop()
{
int c=arr[top];
top--;
return c;
}
public boolean isempty()
{
return top==-1;
}
public int calculate(int n1,int n2,char c)
{
int op=0;
switch(c)
{
case '+':
op+=(n1+n2);
break;
case '-':
op+=(n1-n2);
break;
case '*':
op+=(n1*n2);
break;
case '/':
op+=(n1/n2);
break;
}
return op;
}
public void display()
{
for(int i=top;i>=0;i--)
{
System.out.println(arr[i]);
}
}
public void evaluateprefix(String s1)
{
int output=0;
for(int i=s1.length()-1;i>=0;i--)
{
char c=s1.charAt(i);
if(c>='0' && c<='9')
{
push(c-'0');
}
else if(c=='+' || c=='-' || c=='*' || c=='/' )
{
int n3=pop();
System.out.println(n3);
int n4=pop();
System.out.println(n4);
int p=calculate(n3,n4,c);
push(p);
}
}
}
}
class evaluationprfix
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
stack sb=new stack();
System.out.println("CALCULATE/EVALUATE POSTFIX EXPRESSION");
System.out.println();
System.out.print("ENTER POSTFIX EXPRESSION : ");
String s1=s.nextLine();
sb.evaluateprefix(s1);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
System.out.print("CALCULATE/EVALUATE POSTFIX EXPRESSION : ");
sb.display();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
}
}
