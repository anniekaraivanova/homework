public class two implements one
{
    private double radius;

    public two(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2.0 * Math.PI * radius;
    }
}
