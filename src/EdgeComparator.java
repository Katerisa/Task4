import java.util.Comparator;

public class EdgeComparator implements Comparator<Edge>{
    @Override
    public int compare(Edge a, Edge b) {
        return a.getLength().compareTo(b.getLength());
    }
}
