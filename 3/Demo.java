public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle("Circle A", 5.0);
        shapes[1] = new Ellipse("Ellipse B", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle C", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral D", 6.0);
        shapes[4] = new Triangle("Triangle E", 10.0, 8.0, 6.0);

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}
