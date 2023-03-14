public class Triangle extends Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double halfPerimeter(){
        double p = (this.a + this.b +this.c)/2;
        return p;
    }

    @Override
    double calculateArea() {
        double p = halfPerimeter();
        return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }

    @Override
    double calculatePerimeter() {
        return this.a+this.b+this.c;
    }
}
