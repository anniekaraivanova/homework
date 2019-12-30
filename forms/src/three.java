public class three implements one
{
    private double width;
    private double height;

    public three(double width, double height) {
        this.width= width;
        this.height= height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2.0 * (width + height);
    }
}
