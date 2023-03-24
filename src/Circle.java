public class Circle extends Figure implements Printable{
    private double pi = 3.14;
    private double radius;

    public Circle() {
    }

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

    double diameter(){
        return this.radius*2;
    }

    @Override
    double calculateArea() {
        return this.pi*Math.pow(this.radius, 2.0);
    }

    @Override
    double calculatePerimeter() {
        return 2*this.pi*this.radius;
    }

    @Override
    public void print() {
        System.out.println("radius = " + this.radius +  ", diameter = " + this.diameter() + ", area = " + this.calculateArea() + ", perimeter = " + this.calculatePerimeter());
    }
}
