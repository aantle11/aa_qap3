public class Circle extends Ellipse {
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}
