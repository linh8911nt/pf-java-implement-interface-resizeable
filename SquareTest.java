public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println(square);

        square = new Square("black", false, 3);
        System.out.println(square);

        square.resize(0.1);
        System.out.println(square);
    }
}
