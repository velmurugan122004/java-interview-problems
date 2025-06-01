import java.util.*;
class graph
{
ArrayList<ArrayList<Integer>> list=new ArrayList<>();
public graph(int v)
{
for(int i=0;i<v;i++)
{
list.add(new ArrayList<Integer>());
}
}
public void addedge(int v,int u)
{
list.get(v).add(u);
list.get(u).add(v);
}
public void display()
{
for(int i=0;i<list.size();i++)
{
System.out.println("ADJACENT VERTEX -"+i);
for(int j=0;j<list.get(i).size();j++)
{
System.out.println(list.get(i).get(j));
}
}
}
public void bfs(int v)
{
int s=list.size();
Queue<Integer> q=new LinkedList<>();
boolean visited[]=new boolean[s];
q.add(v);
visited[v]=true;
while(q.size()!=0)
{
int vertex=q.remove();
System.out.print(vertex+" ");
for(int i=0;i<list.get(vertex).size();i++)
{
int av=list.get(vertex).get(i);
if(!visited[av])
{
q.add(av);
visited[av]=true;
}
}
}}
public void dfs(int v)
{
int s=list.size();
Stack<Integer> st=new Stack<>();
boolean[] visited=new boolean[s];
st.add(v);
visited[v]=true;
while(st.size()!=0)
{
int vertex=st.pop();
System.out.print(vertex+" ");
for(int i=0;i<list.get(vertex).size();i++)
{
int av=list.get(vertex).get(i);
if(!visited[av])
{
st.add(av);
visited[av]=true;
}
}
}}
}
class graphtraversal
{
public static void main(String ar[])
{
int choice=0;
Scanner s=new Scanner(System.in);
System.out.print("ENTER NUMBER OF VERTEX:");
graph g=new graph(s.nextInt());
while(choice<=4)
{
System.out.println("ENTER -1- CONNECT EDGE");
System.out.println("ENTER -2- BREADTH FIRST SEARCH");
System.out.println("ENTER -3- DEPTH FIRST SEARCH");
System.out.println("ENTER -4- DISPLAY");
System.out.println("ENTER -5- EXITING");
System.out.print("ENTER YOUR OPTION :");
choice=s.nextInt();
switch(choice)
{
case 1:
g.addedge(s.nextInt(),s.nextInt());
break;
case 2:
g.bfs(0);
System.out.println();
break;
case 3:
g.dfs(0);
System.out.println();
break;
case 4:
g.display();
break;
case 5:
System.out.println("EXITING...................");
System.exit(0);
break;
default :
System.out.println("BETTER LUCK NEXT TIME,CHOICE IS OUT OF LIST");
System.exit(0);
break;
}
}
}}