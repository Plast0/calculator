public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Square s1 = new Square(3.5);
        s1.print();
        Circle c1 = new Circle(1);
        c1.print();
        Triangle t1 = new Triangle(5, 5, 8);
        t1.print();
    }
}