public class Triangle extends Shape {
    private double side1, side2, side3;

    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        if (side1 + side2 <= side3 || side3 + side1 <= side2) {
            System.out.println("Error");
            System.exit(1);
        }
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    private double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
