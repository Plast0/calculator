import java.util.Scanner;

public class Menu {
     Triangle triangle;
     Circle circle;
     Square square;
     Prism prism;
     boolean isTriangle = false;
     boolean isCircle = false;
     boolean isSquare = false;
     boolean isResult = false;
     boolean isPrism = false;

    public Menu() {
    }

    public Menu(Triangle triangle, Circle circle, Square square, Prism prism) {
        this.triangle = triangle;
        this.circle = circle;
        this.square = square;
        this.prism = prism;
    }

    static Scanner in = new Scanner(System.in);

    static void showMenu(){
        System.out.println("Menu.\n1. Choose figure.\n2. Enter figure data.\n3. Show calculation.\n4. Exit ");
    }
     void chooseFigure(){
        System.out.println("1. Triangle.\n2. Circle.\n3. Square.\n4. Prism. ");
        int n;
        isResult = false;
        n = in.nextInt();
        switch(n){
            case 1 :
                isTriangle = true;
                isCircle = false;
                isSquare = false;
                isPrism = false;
                break;
            case 2 :
                isTriangle = false;
                isCircle = true;
                isSquare = false;
                isPrism = false;
                break;
            case 3:
                isTriangle = false;
                isCircle = false;
                isSquare = true;
                isPrism = false;
                break;
            case 4 :
                isTriangle = false;
                isCircle = false;
                isSquare = false;
                isPrism = true;
                break;
        }
    }
    void enterData(){
        double myDouble;
        if (isTriangle) {
            System.out.println("Enter the sides of the triangle:");
            this.triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
            /*myDouble = in.nextDouble();
            this.triangle.setA(myDouble);
            myDouble = in.nextDouble();
            this.triangle.setB(myDouble);
            myDouble = in.nextDouble();
            this.triangle.setC(myDouble);*/
            isResult = true;
        }
        else if (isCircle ) {
            System.out.println("Enter the radius of the circle:");
            this.circle = new Circle(in.nextDouble());
            isResult = true;
        }
        else if (isSquare) {
            System.out.println("Enter the side of the square:");
            this.square = new Square(in.nextDouble());
            isResult = true;
        }
        else if (isPrism ) {
            System.out.println("Enter the high of the prism:");
            myDouble = in.nextDouble();
            System.out.println("Choose the base for the prism:\n1. Triangle.\n2. Circle.\n3. Square.");
            int n;
            n = in.nextInt();
            switch(n) {
                case 1:
                    System.out.println("Enter the values for the triangle sides:");
                    this.triangle = new Triangle(in.nextDouble(), in.nextDouble(), in.nextDouble());
                    this.prism = new Prism(myDouble, triangle);
                    break;
                case 2:
                    System.out.println("Enter the value for the radius of the circle:");
                    this.circle = new Circle(in.nextDouble());
                    this.prism = new Prism(myDouble, circle);
                    break;
                case 3:
                    System.out.println("Enter the value for the side of the square:");
                    this.square = new Square(in.nextDouble());
                    this.prism = new Prism(myDouble, square);
                    break;
            }
            isResult = true;
        }
        else{
            System.out.println("Select a figure first.");
        }
    }


    void showData(){
        //if(isTriangle == false && isCircle == false && isResult == false)
        if(isResult){
            if (isTriangle) {
                triangle.print();
                isTriangle = false;
            }
            else if (isCircle) {
                circle.print();
                isCircle = false;
            }
            else if (isSquare) {
                square.print();
                isSquare = false;
            } else if (isPrism ) {
                prism.print();
                isPrism = false;
            } else {
                System.out.println("Select a figure first.\n");
            }
            isResult = false;
        }
        else {
                System.out.println("Select a figure first and type the data.\n");
            }
    }

}
