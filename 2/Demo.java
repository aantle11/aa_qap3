public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1.0f, 2.0f);
        System.out.println("Point:" + p);

        MovablePoint mp = new MovablePoint(3.00f,4.0f,0.5f,1.0f);
        System.out.println("MovablePoint before move: " + mp);

        mp.move();
        System.out.println("MovablePoint after move: " + mp);

        mp.move();
        System.out.println("MovablePoint after second move: " + mp);
    }
}
