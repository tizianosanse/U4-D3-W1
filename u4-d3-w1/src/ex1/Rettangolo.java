package ex1;

public class Rettangolo {
    private int  height;
    private int width;


    public Rettangolo (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area() {
        return width * height;
    }
    public int perimeter() {
        return (width + height)*2;
    }
public String stampaRettangolo() {
       int perimeter = perimeter();
       int area = area();
               return "area rettangolo: " + area + " perimetro rettangolo: " + perimeter;

}

    @Override
    public String toString() {
        return "{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
