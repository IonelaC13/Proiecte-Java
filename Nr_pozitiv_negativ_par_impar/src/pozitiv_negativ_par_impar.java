import java.util.Scanner;

public class pozitiv_negativ_par_impar {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Introdu numarul de la tastatura: ");
       int x = scanner.nextInt();

       if (x > 0) {
           System.out.println("Numarul introdus este pozitiv.");
       } else if (x < 0) {
           System.out.println("Numarul introdus este impar.");
       } else {
           System.out.println("Numarul este zero.");
       }

       if (x != 0) {
           if (x % 2 == 0) {
               System.out.println("Numarul este par.");
           } else {
               System.out.println("Numarul este impar.");
           }

       }
       scanner.close();
   }
}

