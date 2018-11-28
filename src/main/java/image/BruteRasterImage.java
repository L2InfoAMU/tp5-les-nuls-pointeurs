package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    Color[][] colors;
    int width;
    int height;

    public BruteRasterImage(Color color, int width, int heigth) {
        this.width = width;
        this.height = heigth;
        createRepresentation();
        setPixelsColor(color);
    }

    public BruteRasterImage(Color[][] colors) {
        this.colors = colors;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[y][x];
    }

    public void createRepresentation(){
        colors=new Color[getHeight()][getWidth()];
    }

    public void setPixelColor(Color color, int x, int y){
        colors[y][x]=color;
    }
    private void setPixelsColor(Color[][] pixels){
        colors=pixels;
    }

    private void setPixelsColor(Color color){
        for(int y=0; y<getHeight();y++)
            for(int x=0; x<getWidth();x++)
                colors[y][x]=color;
    }

    public int getHeight() {
        return height;
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

}
