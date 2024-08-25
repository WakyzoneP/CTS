package flyweight;

import java.util.List;

class Recomandare {
    private List<String> set;

    public Recomandare(List<String> set) {
        this.set = set;
    }

    public List<String> getSet() {
        return set;
    }

    public void setText(List<String> set) {
        this.set = set;
    }

    public void print() {
        set.forEach(System.out::println);
    }

}