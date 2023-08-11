package new_pac;

public class main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(2);

        System.out.println("The area of the square is " +
                square.getWidth() + "*" + square.getWidth() + "=" + square.area() +
                ", while the area of the circle is PI*" +
                circle.getWidth() + "*" + circle.getWidth() + "=" +
                circle.area());
    }
}
