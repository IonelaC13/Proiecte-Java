import java.util.Scanner;
public class citeste_numar_intreg {
    public static void main(String[]args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Introdu un numar intreg:");
        int x= scanner.nextInt();

        if(x % 2==0){
                System.out.println("Numarul "+ x + "este par");
        }
            else{
                System.out.println("Numarul " + x + "este impar");
        }
        scanner.close();
    }
}
