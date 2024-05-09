package main;
import java.util.List;
import java.util.Map;

import structures.DataGraph;
import structures.Graph;
import structures.Iterator;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> data = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        var neighbours = Map.of(
            0, List.of(1, 2, 3),
            1, List.of(4, 5),
            2, List.of(6, 7),
            3, List.of(8, 9)
        );

        Graph<Integer> graph = new DataGraph<>(data, neighbours);
        Iterator<Integer> dfsIterator = graph.createDFSIterator();

        while (dfsIterator.hasNext()) {
            System.out.println(dfsIterator.getNext());
        }
    }
}
