package image;

import java.util.Objects;

/**
 * Created by Arnaud Labourel on 09/11/2018.
 */
public class Point {
    public final int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }
    public double distance(Point b){
        return Math.sqrt((x-b.x)*(x-b.x)+(y-b.y)*(y-b.y));
    }


    @Override
    public final int hashCode() {
        return Objects.hash(x, y);
    }


}
