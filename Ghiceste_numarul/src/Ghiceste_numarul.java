import java.util.Scanner;
public class Ghiceste_numarul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numarSecret = 42;  // numărul pe care trebuie să-l ghicești
        int incercare;

        System.out.println("Am ales un numar intre 1 si 100. Incearca sa-l ghicesti!");

        do {
            System.out.print("Introdu un numar: ");
            incercare = scanner.nextInt();

            if (incercare < numarSecret) {
                System.out.println("Numarul secret este mai mare.");
            } else if (incercare > numarSecret) {
                System.out.println("Numarul secret este mai mic.");
            } else {
                System.out.println("Felicitari! Ai ghicit numarul!");
            }
        } while (incercare != numarSecret);

        scanner.close();
    }
}

