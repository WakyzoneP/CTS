package structures;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataGraph<T> implements Graph<T> {
    private final List<Vertex<T>> vertices;

    public DataGraph(List<T> data, Map<Integer, List<Integer>> neighbours) {
        this.vertices = new ArrayList<>();
        data.forEach(d -> vertices.add(new Vertex<>(d)));
        for (var entry : neighbours.entrySet()) {
            Vertex<T> vertex = vertices.get(entry.getKey());
            var neighboursIndexList = entry.getValue();
            List<Vertex<T>> neighboursList = new ArrayList<>();
            neighboursIndexList.forEach(i -> neighboursList.add(vertices.get(i)));
            vertex.setNeighbours(neighboursList);
        }
    }

    @Override
    public Iterator<T> createBFSIterator() {
        return null;
    }

    @Override
    public Iterator<T> createDFSIterator() {
        return new DepthFirstIterator<>(vertices.get(0));
    }
}
