package Graph;
import java.util.*;
public class bellmanFordAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void create(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i]= new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
    }
//    public static void bellMan(ArrayList<Edge> graph[], int src, int V){
//        int dist[]= new int[V];
//        for(int i=0;i<V;i++){
//            if(i!=src){
//                dist[i]=Integer.MAX_VALUE;
//            }
//        }
//        for(int i=0;i<V-1;i++){
//            for(int j=0; j<graph[i].size();j++){
//                Edge e= graph[i].get(j);
//                int u=e.src;
//                int v= e.dest;
//                if(dist[u]!=Integer.MAX_VALUE && dist[u]+e.wt<dist[v]){
//                    dist[v]= dist[u]+e.wt;
//                }
//            }
//        }
//        for(int i=0; i<V;i++){
//            System.out.print(dist[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int V=5;
//        ArrayList<Edge> graph[]= new ArrayList[V];
//        create(graph);
//
//        bellMan(graph,0,V);
//    }
public static ArrayList<Integer> bellmanFord(ArrayList<Edge> graph[], int src, int V) {
    ArrayList<Integer> distances = new ArrayList<>(V);

    // Initialize distances
    for (int i = 0; i < V; i++) {
        // distances.add(i==src ? 0: Integer.MAX_VALUE);
        if(i==src){
            distances.add(i);
        }else{
            distances.add(Integer.MAX_VALUE);
        }
    }

    // Relax all edges V-1 times
    for (int i = 0; i < V - 1; i++) {
        for (int j = 0; j < graph[i].size(); j++) {
            Edge e= graph[i].get(j);
            int u=e.src;
            int v=e.dest;
            if(distances.get(u)!= Integer.MAX_VALUE && distances.get(u)+ e.wt<distances.get(v)){
                distances.set(v, distances.get(u)+e.wt);
            }
        }
    }
    return distances;
}

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);

        ArrayList<Integer> result = bellmanFord(graph, 0, V);
            for (int i = 0; i < V; i++) {
                System.out.print(result.get(i)+" ");
            }
            System.out.println();

    }
}
