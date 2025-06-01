import java.util.*;
class Tnode
{
int data;
Tnode left,right;
int height;
Tnode(int data)
{
this.data=data;
height=0;
}
}
class Avl
{
Tnode root;
public void removeall()
{
root=null;
}
public Boolean checkempty()
{
Boolean check=false;
if(root==null)
check=true;
else
check=false;
return check;
}
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
return new Tnode(data);
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
if(bal>1 && data<node.left.data)//LL CASE
{
return rightrotate(node);
}
  
if(bal>1 && data>node.left.data)//LR CASE
{
node.left=leftrotate(node.left);
return rightrotate(node);
}

if(bal<-1 && data>node.right.data)//RR CASE
{
return leftrotate(node);
}

if(bal<-1 && data<node.right.data)//RL CASE
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
if(root==null)
{
return;
}
else
{
inorder(root.left);
System.out.println(root.data+" height is "+root.height);
inorder(root.right);
}
}
public void preorder(Tnode root)
{
if(root==null)
return;
else
{
System.out.println(root.data+" height is "+root.height);
preorder(root.left);
preorder(root.right);
}
}
public void postorder(Tnode root)
{
if(root==null)
return;
else
{
postorder(root.left);
postorder(root.right);
System.out.println(root.data+" height is "+root.height);
}
}
public boolean search(int value,Tnode root)
{
boolean check=false;
if(root==null)
{
return check;
}
else if(value<root.data)
search(value,root.left);
else if(value>root.data)
search(value,root.right);
else if(value==root.data)
{
check=true;
}
else if(value!=root.data)
{
check=false;
}
return check;
}
public void delete(int data)
{
root=deletenode(root,data);
}
public Tnode deletenode(Tnode node,int data)
{
if(node==null)
{
System.out.println("NO TREE EXITS ");
}
if(data<node.data)
{
node.left=deletenode(node.left,data);
}
else if(data>node.data)
{
node.right=deletenode(node.right,data);
}
else
{
if(node.left==null && node.right==null)
{
return null;
}
else if(node.left==null)
{
return node.right;
}
else if(node.right==null)
{
return node.left;
}
node.data=findmin(node.right);
node.right=deletenode(node.right,node.data);
}
node.height=max(getheight(node.left),getheight(node.right))+1;
int bal=balfactor(node);
if(bal>1)
{
if(balfactor(node.left)>=0)
return rightrotate(node);
else
{
node.left=leftrotate(node.left);
return rightrotate(node);
}
}
if(bal<-1)
{
if(balfactor(node.right)<=0)
return leftrotate(node);
else
{
node.right=rightrotate(node.right);
return leftrotate(node);
}
}
return node;
}
public int findmin(Tnode node)
{
if(node!=null)
{
if(node.left==null)
{
return node.data;
}
}
return findmin(node.left);
}
}
class avlop
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
Avl av=new Avl();
while(choice<=8)
{
System.out.println("AVL TREE OPERTIONS ");
System.out.println("ENTER - 0 -EXIT OPERATION");
System.out.println("ENTER - 1 -INSERT OPERATION");
System.out.println("ENTER - 2 -PREORDER OPERATION");
System.out.println("ENTER - 3 -INORDER OPERATION");
System.out.println("ENTER - 4 -POSTORDER OPERATION");
System.out.println("ENTER - 5 -CHECK EMPTY OPERATION");
System.out.println("ENTER - 6 -SEARCH OPERATION");
System.out.println("ENTER - 7 -REMOVEALL ELEMENT OPERATION");
System.out.println("ENTER - 8 -DELETE OPERATION");
System.out.print("ENTER OPTION :");
choice=s.nextInt();
switch(choice)
{
case 0:
System.out.println("EXITING...................");
System.exit(0);
break;
case 1:
System.out.print("ENTER INSERT ELEMENT :");
av.insert(s.nextInt());
break;
case 2:
av.preorder(av.root);
break;
case 3:
av.inorder(av.root);
break;
case 4:
av.postorder(av.root);
break;
case 5:
if(av.checkempty())
System.out.print("EMPTY AVL TREE ");
else
System.out.print("NOT EMPTYAVL TREE ");
break;
case 6:
System.out.print("ENTER SEARCH ELEMENT :");
if(!av.search(s.nextInt(),av.root))
System.out.print("ELEMENT FOUND");
else
System.out.print("ELEMENT NOT FOUND");
break;
case 7:
av.removeall();
break;
case 8:
System.out.println("ENTER DELETED ELEMENT :");
av.delete(s.nextInt());
break;
default :
System.out.println("YOUR OPTION IS EXITS,BETTER LUCK NEXT TIME ");
System.exit(0);
}
System.out.println();
}
}
}