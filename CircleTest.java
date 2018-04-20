public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle("white", false, 3);
        System.out.println(circle);

        circle.resize(0.5);
        System.out.println(circle);
    }
}
