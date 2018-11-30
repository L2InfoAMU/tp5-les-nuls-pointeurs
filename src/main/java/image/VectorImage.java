package image;

import javafx.scene.paint.Color;

import java.util.List;

public class VectorImage implements Image{
    List<Shape> shapes;
    int width;
    int height;

    public VectorImage(List<Shape> shapes, int width, int height) {
        this.shapes = shapes;
        this.width = width;
        this.height = height;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        for (Shape s:shapes)
            if(s.contains(new Point(x,y)))
                return s.getColor();
        return Color.WHITE;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
