public class Circle extends Figure{
    private double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        double pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 0;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }
}
