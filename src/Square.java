public class Square extends Figure implements Printable{
    private double side;


    public Square(double side) throws Exception {
        if(!(side > 0.0) ) {
            throw new Exception("Sides of the square has to be bigger than 0");
        }
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
