package algorithms.graphs.graphv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph<T> {
    private final HashMap<T, List<T>> graph;
    private final boolean isBidirectional;
    Graph(boolean isBidirectional){
        this.isBidirectional = isBidirectional;
        graph = new HashMap<>();
    }

    void addVertex(T vertex){
        if(!graph.containsKey(vertex))
            graph.put(vertex, new ArrayList<T>());
    }

    void addEdge(T source, T destination){
        if(!graph.containsKey(source)){
            addVertex(source);
        }
        if(!graph.containsKey(destination)){
            addVertex(destination);
        }
        graph.get(source).add(destination);
        if(this.isBidirectional){
            graph.get(destination).add(source);
        }
    }

    public HashMap<T, List<T>> getGraph() {
        return graph;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : graph.keySet()) {
            builder.append(v.toString() + ": ");
            for (T w : graph.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}
