import java.util.LinkedList;
import java.util.Scanner;

class Graph_implement {
  private LinkedList<Integer> adj[];

  public Graph_implement(int V) {
    for (int i = 0; i < V; i++) {
      adj[i] = new LinkedList<Integer>();
    }
  }

  public void insertEdge(int src, int dest) {

    adj[src].add(dest);
    adj[dest].add(src);
  }

}

public class _2_R_Adj_List {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the no of Vertices:");
    int V = sc.nextInt();
    System.out.print("Enter the no of Edges:");
    int E = sc.nextInt();
    Graph_implement g = new Graph_implement(V);

    for (int i = 0; i < E; i++) {
      System.out.println("Enter Src and dest for edge:" + i);
      int src = sc.nextInt();
      int dest = sc.nextInt();
      g.insertEdge(src, dest);
    }

  }
}
