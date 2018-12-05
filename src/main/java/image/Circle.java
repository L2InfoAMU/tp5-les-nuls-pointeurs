package image;

import javafx.scene.paint.Color;

public class Circle implements Shape {
    Point center;
    int ray;
    Color color;

    public Circle(Point center, int ray,Color co) {
        this.center = center;
        this.ray = ray;
        color=co;
    }

    @Override
    public boolean contains(Point point) {
        return center.distance(point)<=ray;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
