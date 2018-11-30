package image;

import javafx.scene.paint.Color;

public class BruteRasterImage extends RasterImage implements Image{
    Color[][] colors;

    public BruteRasterImage(Color color, int width, int heigth) {
        super(width,heigth);
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors) {
        super(colors.length,colors[0].length);
        this.colors = colors;

    }

    @Override
    public Color getPixelColor(int y, int x) {
        return colors[y][x];
    }

    public void createRepresentation(){
        colors=new Color[getHeight()][getWidth()];
    }

    public void setPixelColor(Color color, int y, int x){
        colors[y][x]=color;
    }
    protected void setPixelsColor(Color[][] pixels){
        colors=pixels;
    }

    private void setPixelsColor(Color color){
        for(int y=0; y<getHeight();y++)
            for(int x=0; x<getWidth();x++)
                colors[y][x]=color;
    }


}
