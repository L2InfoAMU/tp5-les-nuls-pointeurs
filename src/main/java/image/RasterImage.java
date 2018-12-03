package image;

import javafx.scene.paint.Color;

public abstract class RasterImage {
    int width;
    int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public RasterImage(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    protected abstract void setPixelsColor(Color[][] pixels);

    public abstract void createRepresentation();
    public abstract Color getPixelColor(int x, int y);
    public abstract void setPixelColor(Color color, int y, int x);
}
