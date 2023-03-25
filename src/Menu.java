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
        double myDouble, myDoubleA, myDoubleB, myDoubleC;
        if (isTriangle) {
            System.out.println("Enter the sides of the triangle:");
            myDoubleA = in.nextDouble();
            myDoubleB= in.nextDouble();
            myDoubleC = in.nextDouble();
            try {
                this.triangle = new Triangle(myDoubleA, myDoubleB, myDoubleC);
            } catch (Exception e) {
                System.out.println(e);
            }
            /*System.out.println("Side A:");
            myDoubleA = in.nextDouble();
            while(myDoubleA > 0.0);
            System.out.println("Side B:");
                myDoubleB = in.nextDouble();
            }
            while(myDoubleB > 0.0);
            do {
                System.out.println("Side C:");
                myDoubleC = in.nextDouble();
            }
            while(myDoubleC > 0.0);
            this.triangle.setA(myDoubleA);
            this.triangle.setB(myDoubleB);
            this.triangle.setC(myDoubleC);*/
            isResult = true;
        }
        else if (isCircle ) {
            System.out.println("Enter the radius of the circle:");
            myDoubleA = in.nextDouble();
            try {
                this.circle = new Circle(myDoubleA);
            } catch (Exception e) {
                System.out.println(e);
            }
            isResult = true;
        }
        else if (isSquare) {
            System.out.println("Enter the side of the square:");
            myDoubleA = in.nextDouble();
            try {
                this.square = new Square(myDoubleA);
            } catch (Exception e) {
                System.out.println(e);
            }
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
                    myDoubleA = in.nextDouble();
                    try {
                        this.triangle = new Triangle(myDoubleA,myDoubleA,myDoubleA);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    this.prism = new Prism(myDouble, triangle);
                    break;
                case 2:
                    System.out.println("You can't make prism with circle as a base. Enter the value for the radius of the circle for cylinder:");
                    myDoubleA = in.nextDouble();
                    try {
                        this.circle = new Circle(myDoubleA);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    this.prism = new Prism(myDouble, circle);
                    break;
                case 3:
                    System.out.println("Enter the value for the side of the square:");
                    myDoubleA = in.nextDouble();
                    try {
                        this.square = new Square(myDoubleA);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
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
