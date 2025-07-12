public class Demo {
    public static void scaleAll(Scalable[] items, double factor) {
        System.out.println("Before scaling:");
        for (Scalable s : items) {
            System.out.println(s);
        }

        for (Scalable s : items) {
            s.scale(factor);
        }

        System.out.println("After scaling:" + factor + ":");
        for (Scalable s : items) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Scalable[] shapes = new Scalable[4];
        shapes[0] = new Circle("Circle A", 5.0);
        shapes[1] = new Ellipse("Ellipse B", 6.0, 4.0);
        shapes[2] = new Triangle("Triangle C", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("Equilateral D", 6.0);

        scaleAll(shapes, 2.0);
    }
}
