public class Ellipse extends Shape {
    protected double a, b;

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        }
        else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (2 * (a * a + b * b) - Math.pow(a - b, 2)) / 2;
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
