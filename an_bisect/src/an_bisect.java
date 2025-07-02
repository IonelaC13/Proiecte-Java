import java.util.Scanner;

public class an_bisect {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un an: ");

        int an = scanner.nextInt();

        if (an % 4 == 0) {
            if (an % 100 == 0) {
                if (an % 400 == 0) {
                    System.out.println("Anul ales este bisect.");
                } else {
                    System.out.println("Anul ales nu este bisect.");
                }
            } else {
                System.out.println("Anul ales este bisect.");
            }
        } else {
            System.out.println("Anul ales nu este bisect.");
        }

        scanner.close();
    }
}

