import java.util.Scanner;

public class tabla_inmultirii{
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}
