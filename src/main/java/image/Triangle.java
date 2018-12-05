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
    private float getArea(){
        return (p1.x *Math.abs(p2.y-p3.y)+p2.x*Math.abs(p3.y-p1.y)+p3.x*Math.abs(p1.y-p2.y))/2;
    }

    @Override
    public boolean contains(Point p) {
        Triangle t1=new Triangle(p, p1,p2,color);
        Triangle t2=new Triangle(p, p2,p3,color);
        Triangle t3=new Triangle(p, p3,p1,color);
        return getArea()==t1.getArea()+t2.getArea()+t3.getArea();
    }

    @Override
    public Color getColor() {
        return color;
    }
}
