import java.util.*;
class graph
{
ArrayList<ArrayList<Integer>> list=new ArrayList<>();


graph(int v)
{
for(int i=0;i<v;i++)
{
list.add(new ArrayList<Integer>());
}
}
public void addedge(int u,int v)
{
list.get(u).add(v);
}
public void display()
{
for(int i=0;i<list.size();i++)
{
System.out.println("The Vertex :"+i);
for(int j=0;j<list.get(i).size();j++)
{
System.out.println(list.get(i).get(j));
}
}
}
}
class directedgraph
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
}
}
