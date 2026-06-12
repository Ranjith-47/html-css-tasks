import java.util.ArrayList;
import java.util.List;
class Edge{
    int dest;
    int weight;
    Edge(int dest, int weight){
        this.dest = dest;
        this.weight = weight;
    }
}
class Graph{
    int vertices;
    ArrayList<List<Edge>> adjlist;
    Graph(int vertices)
    {
        this.vertices = vertices;
        adjlist = new ArrayList<>();
        for(int i=0;i<vertices;i++)
        {
            adjlist.add(new ArrayList<>());
        }
    }
    public void addEdge(int s,int d,int w,boolean dir){
        adjlist.get(s).add(new Edge(d,w));
        if(!dir)
            adjlist.get(d).add(new Edge(s,w));
    }
    public void display()
    {
        for(int i=0;i<vertices;i++)
        {
            System.out.print((char)(i + 65) +"  ");
            List<Edge> cur = adjlist.get(i);
            for(Edge x:cur)
            {
                System.out.print(x.dest+" -> ");
            }
            System.out.println();
        }
    }
}
public class Graph_Implementaion {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        //Give true for direction
        g.addEdge(0,1,7,false);
        g.addEdge(0,4,1,false);
        g.addEdge(1,2,3,false);
        g.addEdge(1,4,8,false);
        g.addEdge(2,4,2,false);
        g.addEdge(2,3,6,false);
        g.addEdge(4,3,7,false);
        g.display();
    }
}
