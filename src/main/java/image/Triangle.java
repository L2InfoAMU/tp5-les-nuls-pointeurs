package image;

import javafx.scene.paint.Color;

public class Triangle implements Shape {
    Point p1;
    Point p2;
    Point p3;
    Color color;

    public Triangle(Point p1, Point p2, Point p3, Color co) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        color=co;
    }

    @Override
    public boolean contains(Point p) {
        float coeff1=((p1.y-p2.y)/(p1.x-p2.x));
        float coeff2 =((p2.y-p3.y)/(p2.x-p3.x));
        float coeff3=((p3.y-p1.y)/(p3.x-p1.x));
        float en01=p1.y-coeff1*p1.x;
        float en02=p2.y-coeff2*p2.x;
        float en03=p3.y-coeff3*p3.x;
        return p.y <= p.x*coeff1+en01 &&p.y <= p.x*coeff2+en02 &&p.y <= p.x*coeff3+en03;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
