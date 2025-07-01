import java.util.Scanner;

public class lungime_metoda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un text: ");

        String text = scanner.nextLine();
        int lungime = calculeazaLungimea(text);
        System.out.println("Lungimea textului este: " + lungime);
        scanner.close();
    }

    static int calculeazaLungimea(String s) {
        return s.length();
    }
}

