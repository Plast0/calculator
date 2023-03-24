public class Prism extends Figure implements Printable{
    double high;
    Figure figure;

    public Prism() {
    }

    public Prism(double high, Figure figure) {
        this.high = high;
        this.figure = figure;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    @Override
    double calculateArea() {
        return this.figure.calculateArea()*high;
    }

    @Override
    double calculatePerimeter() {
        return 2* this.figure.calculateArea() + this.figure.calculatePerimeter() * high;
    }

    @Override
    public void print() {
        System.out.println("High of the prism = " + this.high + ", area = " + this.calculateArea() + ", perimeter = " + this.calculatePerimeter());

    }
}
