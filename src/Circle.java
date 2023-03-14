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
        return this.pi*Math.pow(this.radius, 2.0);
    }

    @Override
    double calculatePerimeter() {
        return 2*this.pi*this.radius;
    }
}
