public class Square extends Figure implements Printable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        double area = this.side*this.side;
        return area;
    }

    @Override
    double calculatePerimeter() {
        return this.side*4;
    }

    @Override
    public void print() {
        System.out.println("side = " + this.side +  ", area = " + this.calculateArea() + ", perimeter = " + this.calculatePerimeter());
    }
}
