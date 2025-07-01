import java.util.Scanner;

public class Divizibilitate {
    public  static void  main(String[]arg){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introdu numarul: ");
         int numar=  scanner.nextInt();

         if( numar % 2== 0){
             System.out.println("Numarul este divizibil cu 2.");
        }
         else{
             System.out.println("Numarul nu este divizibil cu 2.");
         }

        if( numar % 3== 0){
            System.out.println("Numarul este divizibil cu 3.");
        }
        else{
            System.out.println("Numarul nu este divizibil cu 3.");
        }

        if( numar % 5== 0){
            System.out.println("Numarul este divizibil cu 5.");
        }
        else{
            System.out.println("Numarul nu este divizibil cu 5.");
        }
        scanner.close();
    }
}
