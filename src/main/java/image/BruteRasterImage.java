package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    Color[][] colors;


    int width;
    int height;

    public BruteRasterImage(Color[][] colors, int width, int heigth) {
        this.colors = colors;
        this.width = width;
        this.height = heigth;
    }

    public BruteRasterImage(Color[][] colors) {
        this.colors = colors;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[y][x];
    }


    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {

        return width;
    }
}
