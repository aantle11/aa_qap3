public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(String name, double side) {
        suepr(name, side, side, side);
    }

    @Override
    public void scale(double factor) {
        side1 *= factor;
        side2 = side1;
        side3 = side1;
    }
}
