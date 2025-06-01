import java.util.*;
class stack
{
int max;
int top=-1;
char arr[];
public void size(int n)
{
arr=new char[n];
max=n;
}
public void push(char c)
{
if(top==max-1)
{
System.out.println("STACK IS OVERFLOW");
}
else
{
top++;
arr[top]=c;
}
}
public char pop()
{
char c=' ';
if(top<0)
{
System.out.println("STACK IS UNDERFLOW");
}
else
{
c=arr[top];
top--;
}
return c;
}
public boolean isempty()
{
return top==-1 || max==0;
}
public boolean checksymbol(String s)
{
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c=='(' || c=='{' || c=='[' || c=='<')
{
push(c);
}
if(!isempty())
{
char check;
switch(c)
{
case ')':
check=pop();
if(check=='{' || check=='[' || check=='<')
{
return false;
}
break;
case '}':
check=pop();
if(check=='(' || check=='[' || check=='<')
{
return false;
}
break;
case ']':
check=pop();
if(check=='(' || check=='{' || check=='<')
{
return false;
}
break;
case '>':
check=pop();
if(check=='(' || check=='{' || check=='[')
{
return false;
}
break;
}
}
}
boolean find=isempty();
return find;
}
}
class applicationofstackbalancesymbol
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
stack sb=new stack();
System.out.print("PLEASE ENTER ONLY BRACKET SYMBOL(EX-[]{}<>()):");
String s1=s.nextLine();
sb.size(s1.length()+1);
if(sb.checksymbol(s1))
{
System.out.println("BRACKET SYMBOLS ARE BALANCED");
}
else
{
System.out.println("BRACKET SYMBOLS ARE NOT BALANCED");
}
}
}