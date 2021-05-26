package algorithms.graphs.graphv2;

import java.util.*;

public class DFS<T> {
    //store all discovered vertices
    Stack<T> stack = new Stack<>();
    //store visited nodes
    HashMap<T, Boolean> visited = new HashMap<>();

    //store order of traversal
    LinkedList<T> order = new LinkedList<>();

    List<T> traverse(Map<T, List<T>> graph, T s){
        stack.push(s);
        visited.put(s, true);
        for(T v: graph.get(s)){
            if(!visited.containsKey(v)){
                traverse(graph,v);
            }
        }
        order.addFirst(stack.pop());
        if(stack.isEmpty()){
            return order;
        }
        return null;
    }

}
