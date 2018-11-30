package image;

import javafx.scene.paint.Color;

import java.util.LinkedList;

public class PaletteRasterImage extends RasterImage implements Image {
    LinkedList<Color> orderedColors;
    int[][] matrix;

    public PaletteRasterImage(Color color, int width, int height){
        super(width,height);
        createRepresentation();
        setPixelsColor(color);
    }

    public PaletteRasterImage(Color[][] pixels){
        super(pixels.length,pixels[0].length);
        createRepresentation();
        for(int x=0; x<getHeight();x++)
            for(int y=0; y<getWidth();y++)
                setPixelColor(pixels[y][x],x,y);
    }

    private int getnbcolor(Color c){
        if(!orderedColors.contains(c))
            orderedColors.add(c);
        return orderedColors.indexOf(c);
    }


    public void createRepresentation(){
        matrix=new int[getWidth()][getHeight()];
        orderedColors=new LinkedList<Color>();
    }

    public void setPixelColor(Color color, int x, int y){
        matrix[y][x]=getnbcolor(color);
    }
    private void setPixelsColor(Color color){
        for(int x=0; x < getHeight();x++)
            for(int y=0; y < getWidth();y++)
                setPixelColor(color,x,y);
    }

    public void setPixelsColor(Color[][] pixels) {
        for (int x = 0; x < getHeight(); x++)
            for (int y = 0; y < getWidth(); y++)
                setPixelColor(pixels[y][x], y, x);
    }
    @Override
    public Color getPixelColor(int x, int y) {
        return orderedColors.get(matrix[x][y]);
    }
}
