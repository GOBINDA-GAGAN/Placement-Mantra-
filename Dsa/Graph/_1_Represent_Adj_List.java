import java.util.ArrayList;

public class _1_Represent_Adj_List {

  static class Edge {

    int src;
    int dest;
    int weight;

    Edge(int src, int dest, int weight) {
      this.src = src;
      this.dest = dest;
      this.weight = weight;
    }
  }

  public static void main(String[] args) {

    // total vertices (V)
    int V = 5;
    // array size= no of vertices(V)

    ArrayList<Edge>[] graph= new ArrayList[V]; // null each position

   for (int i = 0; i < V; i++) {
    graph[i]=new ArrayList<>(); 
   }

   //for 0-> vertices
   graph[0].add(new Edge(0, 1, 5));

   // for 1-> vertices
   graph[1].add(new Edge(1, 0, 5));
   graph[1].add(new Edge(1, 2, 1));
   graph[1].add(new Edge(1, 3, 3));

   // for 2-> vertices
   graph[2].add(new Edge(2, 1, 1));
   graph[2].add(new Edge(2, 3, 1));
   graph[2].add(new Edge(2, 4, 2));


   // for 3-> vertices
   graph[3].add(new Edge(3, 1, 3));
   graph[3].add(new Edge(3, 2, 1));

   // for 4-> vertices
   graph[4].add(new Edge(4, 2, 2));


  for (int i=0; i<graph[2].size();i++){
    Edge e= graph[2].get(i);
    System.out.println(e.dest);
  }
}
}