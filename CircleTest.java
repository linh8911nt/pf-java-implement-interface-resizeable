public class CircleTest {
    public static void main(String[] args) {
        Circle[] circle = new Circle[3];
        circle[0] = new Circle();
        circle[1] = new Circle(4);
        circle[2] = new Circle("red", false, 5);

        for (Circle c : circle) {
            System.out.println(c);
        }

        double percent = Math.random()*1;
        System.out.println("Percent resize = " + percent);
        for (int i = 0; i < circle.length; i++) {
            circle[i].resize(percent);
            System.out.println(circle[i]);
        }
    }
}
