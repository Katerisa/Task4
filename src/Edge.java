import java.awt.*;

public class Edge {
    public static Point a = new Point();
    public static Point b = new Point();

    public static Integer getLength() {
        return (Math.abs(a.x - b.x) + Math.abs(a.y - b.y));
    }

    public static boolean equals(Edge p, Edge t){
        return ((p.a==t.a && p.b==t.b) || (p.b==t.a && p.a==t.b));
    }


}
