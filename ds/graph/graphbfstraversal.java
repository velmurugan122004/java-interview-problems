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
public void addedge(int v,int av)
{
list.get(v).add(av);
list.get(av).add(v);
}
public void display()
{
for(int i=0;i<list.size();i++)
{
System.out.println("ADJACENT VERTEX :"+	i);
for(int j=0;j<list.get(i).size();j++)
{
System.out.println(list.get(i).get(j));
}
}
}
public void bfs(int v)
{
int s=list.size();
boolean[] visited=new boolean[s];
Queue<Integer> q=new LinkedList<>();
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
}
class graphbfstraversal
{
public static void main(String ar[])
{
Scanner s=new Scanner(System.in);
graph g=new graph(5);
g.addedge(0,1);
g.addedge(0,3);
g.addedge(1,2);
g.addedge(1,3);
g.addedge(2,4);
g.addedge(3,4);
g.display();
g.bfs(0);
}
}