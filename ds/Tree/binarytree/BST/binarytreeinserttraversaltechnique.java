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
class BSt
{
Tnode root;
public void insert(Tnode root,int data)
{
if(root==null)
{
return new Tnode(data);
}
else if(data<root.data)
{
root.left=insert(root.left,data);
}
else if(data>root.data)
{
root.right=insert(root.right,data);
}
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
System.out.print(root.data+" ");
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
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
}
}
public void postorder(Tnode root)
{
if(root==null)
{
return;
}
else
{
postorder(root.left);
postorder(root.right);
System.out.print(root.data+" ");
}
}
}
class binarytreeinserttraversaltechnique
{
public static void main(String ar[])
{
int choice =0;
Scanner s=new Scanner(System.in);
BST bt= new BST();
System.out.println("BINARY SEARCH TREE INSERT AND TRAVERSAL..............");
System.out.println();
System.out.println("ENTER ROOT ELEMENT CAREFULLY DOSEN'T CHANGE");
bt.root=bt.insert(s.nextInt());
while(choice<=4)
{
System.out.println("BINARY SEARCH TREE IN ALL OPERATION");
System.out.println("INSERT OPERATION-ENTER '1'");
System.out.println("INORDER DISPLAY OPERATION-ENTER '2'");
System.out.println("POSTORDER DISPLAY OPERATION-ENTER '3'");
System.out.println("PREORDER DISPLAY OPERATION-ENTER '4'");
System.out.println("EXITING......-ENTER '5'");
System.out.println("ENTER YOUR OPTION");
choice=s.nextInt();
switch(choice)
{
case 1:
System.out.print("ENTER INSERT ELEMENT : );
bt.insert(bt.root,s.nextInt());
break;
case 2:
System.out.println("TRAVERSAL/DISPLAY INORDER......");
bt.inorder(bt.root);
break;
case 3:
System.out.println("TRAVERSAL/DISPLAY POSTORDER......");
bt.postorder(bt.root);
break;
case 4:
System.out.println("TRAVERSAL/DISPLAY PREORDER......");
bt.preorder(bt.root);
break;
case 4:
System.out.println("EXITING..........................");
System.exit(0);
break;
}
}
}
}
