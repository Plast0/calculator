public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Square s1 = new Square(3.5);
        System.out.println(s1.calculateArea());
        System.out.println(s1.calculatePerimeter());
        Circle c1 = new Circle(1);
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculatePerimeter());
        Triangle t1 = new Triangle(5, 5, 8);
        System.out.println(t1.calculateArea());
        System.out.println(t1.calculatePerimeter());
    }
}