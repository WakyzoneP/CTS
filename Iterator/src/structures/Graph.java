package structures;
public interface Graph<T> {
    Iterator<T> createBFSIterator();
    Iterator<T> createDFSIterator();
}
