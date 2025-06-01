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
public void search(Tnode root,int d)
{
if(root==null)
{
System.out.println("ELEMENT IS NOT FOUND");
return;
}
if(root.data==d)
{
System.out.println("ELEMENT IS FOUND");
return;
}
else if(d<root.data)
{
search(root.left,d);
}
else if(d>root.data)
{
search(root.right,d);
}
}
public int minelement(Tnode root)
{
if(root==null)
{
System.out.println("NO TREE EXISTS");
}
else if(root.left==null)
{
return root.data;
}
return minelement(root.left);
}
public int maxelement(Tnode root)
{
if(root==null)
{
System.out.println("NO TREE EXISTS");
}
else if(root.right==null)
{
return root.data;
}
return maxelement(root.right);
}
}
class bstinsertandsearch
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
bst bt=new bst();
System.out.println("ENTER THE ROOT ELEMENT");
bt.insert(s.nextInt());
System.out.println("ENTER THE REMAINING ELEMENT");
while(choice<=5)
{
System.out.println("INSERT OPERATION-ENTER '1'");
System.out.println("SEARCH OPERATION-ENTER '2'");
System.out.println("MINIMUM ELEMENT OPERATION-ENTER '3'");
System.out.println("MAXIMUM ELEMENT OPERATION-ENTER '4'");
System.out.println("EXITING......-ENTER '5'");
System.out.println();
System.out.print("ENTER YOUR OPTION : ");
choice=s.nextInt();
System.out.println();
switch(choice)
{
case 1:
System.out.print("ENTER INSERT ELEMENT : ");
bt.insert(s.nextInt());
break;
case 2:
System.out.print("ENTER SEARCH ELEMENT : ");
bt.search(bt.root,s.nextInt());
System.exit(0);
break;
case 3:
System.out.println("MINIMUM ELEMENT OF BINARY TREE");
System.out.println(bt.minelement(bt.root));
break;
case 4:
System.out.println("MAXIMUM ELEMENT OF BINARY TREE");
System.out.println(bt.maxelement(bt.root));
break;
case 5:
System.out.print("EXITING..................... ");
System.exit(0);
break;
default :
System.out.println("YOUR OPTION EXITS LIMIT BETTER LUCK NEXT TIME ");
System.exit(0);
break;
}
System.out.println();
}
}
}