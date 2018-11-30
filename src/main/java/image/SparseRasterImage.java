package image;

import javafx.scene.paint.Color;

import java.util.HashMap;
import java.util.Map;

public class SparseRasterImage extends RasterImage implements Image {
    Color defaultcolor;
    Map<Point,Color> map;


    public SparseRasterImage(Color color, int width, int height)
    {
        super(width, height);
        this.defaultcolor=color;
        createRepresentation();
    }

    public SparseRasterImage(Color[][] pixels){
        super(pixels.length, pixels[0].length);
        createRepresentation();
        setPixelsColor(pixels);
    }

    @Override
    public void createRepresentation() {
        map=new HashMap<Point,Color>();
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return map.getOrDefault(new Point(x,y),defaultcolor);
    }

    @Override
    public void setPixelColor(Color color, int x, int y) {
        map.put(new Point(x,y),color);
    }

    @Override
    protected void setPixelsColor(Color[][] pixels) {
        for(int x=0;x<getWidth();x++)
            for(int y=0;y<getHeight();y++)
                setPixelColor(pixels[x][y],x,y);
    }
}
