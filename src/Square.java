public class Square extends Figure{
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

}
