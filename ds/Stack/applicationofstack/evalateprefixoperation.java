import java.util.*;
class stack 
{
int top=-1;
int arr[]=new int[50];
public void push1(int data)
{
top++;
arr[top]=data;
}
public int pop()
{
int c=arr[top];
top--;
return c;
}
public int calculate(int n1,int n2,String c)
{
int op=0;
switch(c)
{
case "+":
op=n1+n2;
break;
case "-":
op=n1-n2;
break;
case "*":
op=n1*n2;
break;
case "/":
op=n1/n2;
break;
}
//System.out.println(op);
return op;
}
public static boolean isoperand(String s)
{
return s.matches("\\d+");
}
public void evaluateprefix(String s)
{
String s1[]=s.split("\\s+");
for(int i=s1.length-1;i>=0;i--)
{
String c=s1[i];
//System.out.println(c);
//System.out.println(isoperand(c));
if(isoperand(c))
{
push1(Integer.parseInt(c));
}
else
{
int n1=pop();
int n2=pop();
int res=calculate(n1,n2,c);
push1(res);
}
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
System.out.print("ENTER PREFIX EXPRESSION:");
String s1=s.nextLine();
sb.evaluateprefix(s1);
System.out.println(sb.pop());
}
}