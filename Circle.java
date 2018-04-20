public class Circle extends Shape implements Resizeable{
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPeimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        double newRadius = getRadius() + getRadius() * percent;
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                '}' + " which is subclass of " + super.toString();
    }
}
