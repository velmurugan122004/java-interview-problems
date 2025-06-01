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
root=insertnode(data,root);
}
public Tnode insertnode(int data,Tnode root)
{
if(root==null)
{
return new Tnode(data);
}
else if(data<root.data)
{
root.left=insertnode(data,root.left);
}
else if(data>root.data)
{
root.right=insertnode(data,root.right);
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
System.out.print(root.data+" ");
inorder(root.right);
}
}
public void delete(int data,Tnode root)
{
if(root==null)
{
return;
}
else
{
if(root.data!=data)
{
delete(data,root.left);
System.out.println(root.data);
delete(data,root.right);
}
}
}
}
class bstoperation
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
bst bt=new bst();
bt.insert(10);
bt.insert(20);
bt.insert(50);
bt.insert(5);
bt.insert(1);
bt.inorder(bt.root);
System.out.println();
bt.delete(1,bt.root);
System.out.println();
bt.inorder(bt.root);
}
}
