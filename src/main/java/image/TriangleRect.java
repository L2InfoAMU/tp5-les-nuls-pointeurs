package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class TriangleRect extends Triangle{

    public TriangleRect(Point p1, Point p2, Point p3, Color co) {
        super(p1, p2, p3, co);
        float a= (float) distance(p1,p2);
        float b= (float) distance(p2,p3);
        float c= (float) distance(p1,p3);
        if(!( a*a==c*c+b*b || b*b==c*c+a*a || c*c==a*a+b*b))throw new IllegalArgumentException("pythagore not verified");
    }
}
