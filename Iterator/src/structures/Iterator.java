package structures;
public interface Iterator<T> {
    boolean hasNext();
    Vertex<T> getNext();
    void reset();
}
