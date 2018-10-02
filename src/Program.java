import java.awt.*;
import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args){
        int n = 0;
        ArrayList<Point> vertex = new ArrayList<>();
        ArrayList<Edge> edges = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Asus\\Documents\\учеба\\Комбинаторные алгоритмы\\Task4\\src\\in.txt"));
            n = Integer.parseInt(reader.readLine());
            //добавляем все точки в лист vertex
            for (int i=0; i<n; i++) {
                String[] line = reader.readLine().split(" ");
                Point a = new Point(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
                vertex.add(a);
            }
            //заполняем лист edges всеми возможными ребрами
            for (int i=0; i<n-1; i++) {
                Point a = vertex.get(i);
                for (int j=i+1; j<n; j++) {
                    Edge e = new Edge();
                    e.a = a;
                    e.b = vertex.get(j);
                    edges.add(e);
                }
            }
            //сортируем по длине ребра
            Collections.sort(edges, new EdgeComparator());

            //
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
