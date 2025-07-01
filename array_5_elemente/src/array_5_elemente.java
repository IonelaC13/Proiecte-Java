import java.util.Scanner;

public class array_5_elemente {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        int numere[] = new int[5];
        int sum= 0;
        for(int i =0; i<5; i++) {
            System.out.println("Introdu un numar: ");
            numere[i] = scanner.nextInt();
            sum += numere[i];
        }
        System.out.println("Suma este: "+ sum);

        scanner.close();
    }
}
