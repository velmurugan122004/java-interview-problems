class Tnode
{
int data;
Tnode left;
Tnode right;
Tnode(int data)
{
this.data=data;
}
}
class BST
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
System.out.print(root.data+" ");
inorder(root.right);
}
}
}
class binarytreeinsert
{
public static void main(String ar[])
{
BST bt=new BST();
bt.insert(50);
bt.insert(30);
bt.insert(10);
bt.insert(60);
bt.insert(55);
bt.inorder(bt.root);
}
}