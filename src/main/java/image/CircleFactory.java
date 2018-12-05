package image;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;

public class CircleFactory implements ImageFactory{
    public Image makeImage() {
        Color dark = Color.rgb(35,31,32);
        List<Shape> list=new ArrayList<>();
        list.add(new Circle(new Point(300,300),200,dark));
        return new VectorImage(list,600,600);
    }
}
