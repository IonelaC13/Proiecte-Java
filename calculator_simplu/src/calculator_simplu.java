import java.util.Scanner;

public class calculator_simplu {
    public static void main(String[]arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int x = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int y = scanner.nextInt();

        System.out.println("Alege operatia(+,-,*,/): ");
        char operatie = scanner.next().charAt(0);

        if (operatie == '+') {
            System.out.println("Rezultatul este: " + (x + y));
        } else if (operatie == '-') {
            System.out.println("Rezultatul este: " + (x - y));
        } else if (operatie == '*') {
            System.out.println("Rezultatul este: " + (x * y));
        } else if (operatie == '/') {
            if (y != 0) {
                System.out.println("Rezultatul este: " + (x / y));
            } else {
                System.out.println("Operație necunoscută!");
            }
            scanner.close();
        }
    }
}

