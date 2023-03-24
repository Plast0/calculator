import java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);



    public static void main(String[] args) {
        Menu menu;
        menu = new Menu();
        int n;
        do {
            menu.showMenu();
            n = in.nextInt();
            switch(n){
                case 1 : menu.chooseFigure();
                break;
                case 2 : menu.enterData();
                break;
                case 3 : menu.showData();
                break;
            }
        }
        while( n != 4);

    }
}