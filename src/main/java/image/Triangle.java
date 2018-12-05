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
    double distance(Point a, Point b){
        return Math.sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
    private double getArea(){
        double a=distance(p1,p2);
        double b=distance(p2,p3);
        double c=distance(p1,p3);
        double s=(a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public boolean contains(Point p) {
        Triangle t1=new Triangle(p, p1,p2,color);
        Triangle t2=new Triangle(p, p2,p3,color);
        Triangle t3=new Triangle(p, p3,p1,color);
        return getArea()<t1.getArea()+t2.getArea()+t3.getArea()+0.0000001 && t1.getArea()+t2.getArea()+t3.getArea()-0.0000001<getArea();//0.0000001 pour arrondis
    }

    @Override
    public Color getColor() {
        return color;
    }
}
