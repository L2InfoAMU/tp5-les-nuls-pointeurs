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
    public Color getPixelColor(int x, int y) {
        return colors[x][y];
    }

    public void createRepresentation(){
        colors=new Color[getWidth()][getHeight()];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[x][y]=color;
    }

    protected void setPixelsColor(Color[][] pixels){
        colors=pixels;
    }

    private void setPixelsColor(Color color){
        for(int x=0; x<getWidth();x++)
            for(int y=0; y<getHeight();y++)
                colors[x][y]=color;
    }


}
