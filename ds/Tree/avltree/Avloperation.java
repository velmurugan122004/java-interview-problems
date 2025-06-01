import java.util.*;
class Tnode
{
int data;
Tnode left;
Tnode right;
int height;
Tnode (int data)
{
this.data=data;
Tnode left=right=null;
height=0;
}
}
class Avltree
{
Tnode root=null;
public void insert(int data)
{
root=insertnode(root,data);
}
public int getHeight(Tnode node)
{
if(node==null)
{
return -1;
}
return node.height;
} 
public int max(int a,int b)
{
return a>b?a:b;
}
public Tnode insertnode(Tnode node,int data)
{
if(node==null)
{
return new Tnode(data);
}

if(data<node.data)
{
node.left=insertnode(node.left,data);
}
else if(data>node.data)
{
node.right=insertnode(node.right,data);
}
else
{
return node;
}
node.height=(max(getHeight(node.left),getHeight(node.right)))+1;
int bal=balfactor(node);

if(bal>1 && data<node.left.data)
{
return rightrotate(node);   //LL
}


if(bal>1 && data>node.left.data)
{
node.left=leftrotate(node.left);
return rightrotate(node);    //LR
}


if(bal<-1 && data>node.right.data)
{
return leftrotate(node);    //RR
}

if(bal<-1 && data<node.right.data)
{
node.right=rightrotate(node.right);
return leftrotate(node);
}
return node;
}
public Tnode rightrotate(Tnode z)
{
Tnode y=z.left;
Tnode t3=y.right;
y.right=z;
z.left=t3;
z.height=max(getHeight(z.left),getHeight(z.right))+1;
y.height=max(getHeight(y.left),getHeight(y.right))+1;
return y;
}

public Tnode leftrotate(Tnode z)
{
Tnode y=z.right;
Tnode t3=y.left;
y.left=z;
z.right=t3;
z.height=max(getHeight(z.left),getHeight(z.right))+1;
y.height=max(getHeight(y.left),getHeight(y.right))+1;
return y;
}
public int balfactor(Tnode node)
{
if(node==null)
{
return 0;
}
return getHeight(node.left)-getHeight(node.right);
} 
public void inorder(Tnode root)
{
if(root==null)
{
return;
}
inorder(root.left);
System.out.println(root.data+" height is "+root.height);
inorder(root.right);
}
}
class Avloperation
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
Avltree av=new Avltree();
av.insert(50);
av.insert(60);
av.insert(20);
av.insert(10);
av.insert(30);
System.out.println();
System.out.println("ROOT NODE OF TREE IS:"+av.root.data);
System.out.println();
av.insert(40);
av.inorder(av.root);

}
}