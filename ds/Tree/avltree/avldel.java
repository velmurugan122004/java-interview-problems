import java.util.*;
class Tnode
{
int data;
Tnode left;
Tnode right;
int height;
Tnode(int data)
{
this.data=data;
height=0;
Tnode left=right=null;
}
}
class avl
{
Tnode root;
public void insert(int data)
{
root=insertnode(data,root);
}
public int max(int a,int b)
{
return a>b?a:b;
}
public int getheight(Tnode node)
{
if(node==null)
{
return -1;
}
return node.height;
}
public int balfactor(Tnode node)
{
if(node==null)
{
return 0;
}
return getheight(node.left)-getheight(node.right);
}
public Tnode insertnode(int data,Tnode node)
{
if(node==null)
{
return new Tnode (data);
}
if(data<node.data)
{
node.left=insertnode(data,node.left);
}
else if(data>node.data)
{
node.right=insertnode(data,node.right);
}
else
{
return node;
}
node.height=max(getheight(node.left),getheight(node.right))+1;
int bal=balfactor(node);
if(bal>1 && data<node.left.data)
return rightrotate(node);
if(bal>1 && data>node.left.data)
{
node.left=leftrotate(node.left);
return rightrotate(node);
}
if(bal<-1 && data>node.right.data)
return leftrotate(node);
if(bal<-1 && data<node.right.data)
{
node.right=rightrotate(node.right);
return leftrotate(node);
}
return node;
}
public Tnode leftrotate(Tnode z)
{
Tnode y=z.right;
Tnode t3=y.left;
y.left=z;
z.right=t3;
z.height=max(getheight(z.left),getheight(z.right))+1;
y.height=max(getheight(y.left),getheight(y.right))+1;
return y;
}
public Tnode rightrotate(Tnode z)
{
Tnode y=z.left;
Tnode t3=y.right;
y.right=z;
z.left=t3;
z.height=max(getheight(z.left),getheight(z.right))+1;
y.height=max(getheight(y.left),getheight(y.right))+1;
return y;
}
public void inorder(Tnode root)
{
if(root!=null)
{
inorder(root.left);
System.out.println(root.data+" height is "+root.height);
inorder(root.right);
}
}
class avldel
{
public void main(String ar[])
{
Scanner s=new Scanner(System.in);
avl av=new avl();
av.insert(50);
av.insert(60);
av.insert(20);
av.insert(10);
av.insert(30);
av.insert(40);
av.inorder(av.root);
}
}
}
