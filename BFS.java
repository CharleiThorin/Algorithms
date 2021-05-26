package algorithms.graphs.graphv2;

import java.util.*;

public class BFS<T> {

    //store the traversal order and return this list
    ArrayList<T> order = new ArrayList<>();

    //to record all those nodes we discover
    private final Queue<T> queue = new LinkedList<>();

    // BFS traversal from a given source
    public void traverse(Map<T, List<T>> graph, T source){
        //to record all visited nodes
        HashMap<T, Boolean> visited = new HashMap<>(graph.size());

        queue.add(source);
        visited.put(source, true);

        while (!queue.isEmpty()){
            T vertex = queue.poll();
            for(T v: graph.get(vertex)){
                if(!visited.containsKey(v))
                    queue.add(v);
                    visited.put(v,true);
            }
            order.add(vertex);
        }
        System.out.println(order);
    }




}
