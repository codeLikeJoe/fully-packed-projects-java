package new_pac;

public class Circle extends Shape {
    private int width;
    private double pi = (double) 22 / 7;
    private double area;

    public Circle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double area() {
        area = pi * width * width;
        return area;
    }
}
