package Graph;
import java.util.*;
public class adjacencyList {
    static class Edge{
        int source;
        int destination;
        int weight;

        Edge(int s, int d, int w){
            this.source=s;
            this.destination=d;
            this.weight=w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){

        //need to fill the array with the empty nodes, else it saves null value! and will give error!!
        for(int i=0; i< graph.length; i++){
            graph[i]= new ArrayList<Edge>();
        }
        //for unweighted, undirected graph!!
//        graph[0].add(new Edge(0,2));
//
//        graph[1].add(new Edge(1,2));
//        graph[1].add(new Edge(1,3));
//
//        graph[2].add(new Edge(2,0));
//        graph[2].add(new Edge(2,1));
//        graph[2].add(new Edge(2,3));
//
//        graph[3].add(new Edge(3,1));
//        graph[3].add(new Edge(3,2));

        //for weighted, undirected graph!!
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void main(String[] args) {
        int V=4;

        ArrayList<Edge> graph[]= new ArrayList[V];
        createGraph(graph);

        for(int i=0; i<graph[2].size();i++){
            Edge e= graph[2].get(i);
            System.out.println(e.destination+"->"+e.weight);
        }
    }
}

