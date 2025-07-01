import java.util.Scanner;

public class numaratoare_inversa {
    public static void main(String[] arg) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introdu un numar: ");

        int x = scanner.nextInt();

        for(int i=x; i >= 0; i--){

            System.out.println(i);
        }

        scanner.close();


    }
}
