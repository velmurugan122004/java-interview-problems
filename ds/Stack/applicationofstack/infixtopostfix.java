import java.util.*;
class stack
{
int top=-1;
char arr[]=arr=new char[15];
public void push(char data)
{
top++;
arr[top]=data;
}
public char pop()
{
char c=arr[top];
top--;
return c;
}
public Boolean isempty()
{
return top==-1 ;
}
public Boolean priority(char c1)
{
char c2=arr[top];
Boolean check=true;
switch(c1)
{
case '*':
if(c2=='*' || c2=='/')
{
check=false;
}
break;
case '/':
if(c2=='*' || c2=='/' )
{
check=false;
}
break;
case '+':
if(c2=='*' || c2=='/' || c2=='+' || c2=='-')
{
check=false;
}
break;
case '-':
if(c2=='*' || c2=='/' || c2=='+' || c2=='-')
{
check=false;
}
break;
}
return check;
}
public String symbol(char c1)
{
String s1=new String();
for(int i=top;i>=0;i--)
{
if(arr[i]=='(')
{
top--;
break;
}
else
{
s1+=pop();
}
}
return s1;
}
public String infixtopostfix(String s)
{ 
String s1=new String();
s=s.toLowerCase();
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c>='a'&&c<='z')
{
s1+=c;
}
else if(c>=48 && c<=57)
{
s1+=c;
}
else if(c=='*' || c=='/' || c=='+' || c=='-')
{
if(isempty())
{
push(c);
}
else
{
if(priority(c))
{
push(c);
}
else
{
s1+=pop();
push(c);
}
}
}
else if(c=='(')
{
push(c);
}
else if(c== ')')
{
s1+=symbol(c);
}
}
if(!isempty())
{
for(int i=top;i>=0;i--)
{
s1+=pop();
}
}
return s1;
}
}
class infixtopostfix
{
public static void main(String ar[])
{
System.out.println("CONVERT INFIX TO POSTFIX EXPRESSION");
Scanner s=new Scanner(System.in);
stack sb=new stack();
System.out.print("ENTER INFIX EXPERSION:");
String s1=s.nextLine();
String s2=sb.infixtopostfix(s1);
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
System.out.println("CONVERT POSTFIX EXPRESSION:"+s2);
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
}
}
