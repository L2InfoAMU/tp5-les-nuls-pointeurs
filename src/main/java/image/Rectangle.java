package image;


import javafx.scene.paint.Color;

public class Rectangle implements Shape{
    Point point;
    int width;
    int height;
    Color color;
    Rectangle(int x, int y, int width, int height, Color color){
        point=new Point(x,y);
        this.height=height;
        this.width=width;
        this.color=color;
    }
    public boolean contains(Point p){
        return point.x<p.x && p.x<point.x+width && point.y<p.y && p.y<point.y+height;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

