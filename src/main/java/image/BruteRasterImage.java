package image;

import javafx.scene.paint.Color;

public class BruteRasterImage implements Image{
    Color[][] colors;
    int width;
    int heigth;

    public BruteRasterImage(Color[][] colors, int width, int heigth) {
        this.colors = colors;
        this.width = width;
        this.heigth = heigth;
    }

    public BruteRasterImage(Color[][] colors) {
        this.colors = colors;
    }

    @Override
    public Color getPixelColor(int x, int y) {
        return colors[y][x];
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }
}
