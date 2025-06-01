import java.util.*;
class Tnode
{
int data;
Tnode left;
Tnode right;
Tnode (int data)
{
this.data=data;
}
}
class bst
{
Tnode root;
public void insert(int data)
{
root=insertnode(root,data);
}
public Tnode insertnode(Tnode root,int data)
{
if(root==null)
{
return new Tnode(data);
}
else if(data<root.data)
{
root.left=insertnode(root.left,data);
}
else if(data>root.data)
{
root.right=insertnode(root.right,data);
}
return root;
}
public void inorder(Tnode root)
{
if(root==null)
{
return;
}
else
{
inorder(root.left);
System.out.println(root.data+" ");
inorder(root.right);
}
}
public void preorder(Tnode root)
{
if(root==null)
{
return;
}
else
{
System.out.println(root.data+" ");
preorder(root.left);
preorder(root.right);
}
}
public void postorder(Tnode root)
{
if(root==null)
{
return ;
}
else
{
postorder(root.left);
postorder(root.right);
System.out.println(root.data+" ");
}
}
public void search(Tnode root,int value)
{
if(root==null)
{
System.out.println("ELEMENT IS NOT FOUND");
return;
}
if(root.data==value)
{
System.out.println("ELEMENT IS FOUND");
return;
}
else if(value<root.data)
{
search(root.left,value);
}
else if(value>root.data)
{
search(root.right,value);
}
}
public int findmin(Tnode root)
{
if(root==null)
{
System.out.println("NO TREE EXITS");
}
if(root.left==null)
{
return root.data;
}
return findmin(root.left);
}
public int findmax(Tnode root)
{
if(root==null)
{
System.out.println("NO TREE EXITS");
}
else if(root.right==null)
{
return root.data;
}
return findmax(root.right);
}
public void delete(int val)
{
root=deletenode(root,val);
}
public Tnode deletenode(Tnode root,int value)
{
if(root==null)
{
System.out.println("NO TREE EXITS");
}
if(value<root.data)
{
root.left=delete(root.left,value);
}
else if(value>root.data)
{
root.right=delete(root.right,value);
}
else
{
if(root.left==null)
{
return root.right;
}
else if(root.right==null)
{
return root.left;
}
root.data=findmin(root.right);
root.right=delete(root.right,root.data);
}
return root;
}
}
class bstalloperation
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
bst bt=new bst();
System.out.println("ENTER THE ROOT ELEMENT");
bt.insert(s.nextInt());
while(choice<=8)
{
System.out.println("ENTER '0'-EXITING OPERATION");
System.out.println("ENTER '1'-INSERT ELEMENT");
System.out.println("ENTER '2'-INOREDER TRAVERSAL");
System.out.println("ENTER '3'-PREORDER TRAVERSAL");
System.out.println("ENTER '4'-POSTORDER TRVAERSAL");
System.out.println("ENTER '5'-SEARCH ELEMENT");
System.out.println("ENTER '6'-MINIMUM ELEMENT IN TREE");
System.out.println("ENTER '7'-MAXIMUM ELEMENT IN TREE");
System.out.println("ENTER '8'-DELETE ELEMENT IN TREE");
System.out.print("ENTER YOUR OPTION:");
choice=s.nextInt();
switch(choice)
{
case 0:
System.out.println("THANKYOU FOR CHOOSING BST OPERATION ");
System.out.println("EXITING........");
System.exit(0);
break;
case 1:
System.out.print("ENTER INSERT ELEMENT IN TREE : ");
bt.insert(s.nextInt());
break;
case 2:
System.out.println();
System.out.println("INORDER TRAVERSAL");
bt.inorder(bt.root);
break;
case 3:
System.out.println();
System.out.println("PREORDER TRAVERSAL");
bt.preorder(bt.root);
break;
case 4:
System.out.println();
System.out.println("POSTORDER TRAVERSAL");
bt.postorder(bt.root);
break;
case 5:
System.out.print("ENTER SEARCH ELEMENT:");
bt.search(bt.root,s.nextInt());
break;
case 6:
System.out.println("MINIMUM ELEMENT IN TREE :"+bt.findmin(bt.root));
break;
case 7:
System.out.println("MAXIMUM ELEMENT IN TREE :"+bt.findmax(bt.root));
break;
case 8:
System.out.print("ENTER DELETE ELEMENT : ");
bt.delete(s.nextInt());
break;
default:
System.out.println();
System.out.println("YOUR OPTION IS EXITS,PLEASE CHECK YOUR OPTION");
System.out.println("BETTER LUCK NEXT TIME");
System.exit(0);
break;
}
System.out.println();
}
}
}