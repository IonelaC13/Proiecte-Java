import java.util.Scanner;
public class suma_cifrelor_para {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un număr întreg pentru a verifica dacă suma cifrelor este pară sau impară: ");

        int num = scanner.nextInt();
        int a;

        int sum = 0;

        while (num > 0) {
            a = num % 10;
            sum += a;
            num = num / 10;

        }
        System.out.println(sum);
        if (sum % 2 == 0) {
            System.out.println("Suma cifrelor este para.");
        } else {
            System.out.println("Suma cifrelor este impara.");
        }
        scanner.close();
    }
    }

