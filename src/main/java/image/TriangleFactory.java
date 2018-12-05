package image;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactory {
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        List<Shape> list=new ArrayList<>();
        list.add(new Triangle(new Point(10,15),new Point(300,45), new Point(350,500),dark));
        return new VectorImage(list,600,600);
    }
}
