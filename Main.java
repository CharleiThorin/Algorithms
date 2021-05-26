package algorithms.graphs.graphv2;

public class Main {
    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<Integer>(true);
        graph.addVertex(1);
        graph.addEdge(2,1);
        graph.addVertex(3);
        graph.addEdge(1,3);
        graph.addEdge(5,6);
        graph.addEdge(6,2);
        graph.addEdge(7,1);
        graph.addEdge(8,6);
        graph.addEdge(7,5);
        graph.addEdge(8,7);
        graph.addEdge(7,3);
        graph.addEdge(9,6);
        graph.addVertex(9);
        graph.addEdge(8,9);
        System.out.println(graph);

        BFS<Integer> bfs = new BFS<>();
        bfs.traverse(graph.getGraph(),2);

        DFS<Integer> dfs = new DFS<>();
        System.out.println(dfs.traverse(graph.getGraph(),1));

    }
}
