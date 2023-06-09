public class Circle extends Figure implements Printable{
    private double pi = 3.14;
    private double radius;


    public Circle(double radius) throws Exception {
        if(!(radius > 0.0) ) {
            throw new Exception("Radius of the circle has to be bigger than 0");
        }
        this.radius = radius;
        double pi = 3.14;
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
