package Graph;

import java.util.ArrayList;

public class DirectedCycleDetection {
    static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void create(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));
    }

    public static boolean isCycle(ArrayList<Edge> graph[], int curr, boolean vis[], boolean recur[]){
        vis[curr]=true;
        recur[curr]=true;

        for(int i=0; i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(recur[e.dest]) return true;
            else if(! vis[e.dest]){
                if(isCycle(graph,e.dest,vis, recur)){
                    return true;
                }
            }
        }
        recur[curr]=false;
        return false;
    }

    public static void main(String[] args) {
        int V=4;
        ArrayList<Edge> graph[]= new ArrayList[V];
        create(graph);

        boolean vis[]= new boolean[V];
        boolean recur[]= new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                boolean isCyclic= isCycle(graph,i,vis,recur);
                if(isCyclic){
                    System.out.println(isCyclic);
                    break;
                }else{
                    System.out.println(isCyclic=false);
                    break;
                }
            }
        }
    }
}
