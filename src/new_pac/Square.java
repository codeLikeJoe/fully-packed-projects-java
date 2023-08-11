package new_pac;

public class Square extends Shape {
    private int width;
    private int area;

    public Square(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public double area() {
        area = width * width;
        return area;
    }
}
