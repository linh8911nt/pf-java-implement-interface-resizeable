public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle);

        rectangle = new Rectangle("Red", false, 3, 6);
        System.out.println(rectangle);

        rectangle.resize(0.1);
        System.out.println(rectangle);
    }
}
