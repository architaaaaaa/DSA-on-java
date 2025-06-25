package Graph;
import java.util.*;
public class source2TArget {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    // Modified to return the count of paths
    public static int printPath(ArrayList<Edge> graph[], int curr, boolean vis[], int target, String path) {
        if (curr == target) {
            System.out.println(path);
            return 1; // Return 1 for each valid path found
        }

        int count = 0;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                count += printPath(graph, e.dest, vis, target, path + "->" + e.dest);
                vis[curr] = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        create(graph);

        boolean vis[] = new boolean[V];
        int pathCount = printPath(graph, 0, vis, 5, "0");
        System.out.println("Total number of paths: " + pathCount);
    }
}
