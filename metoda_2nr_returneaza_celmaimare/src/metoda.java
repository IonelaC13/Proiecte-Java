import java.util.Scanner;

public class metoda {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introdu primul numar: ");
        int a = scanner.nextInt();

        System.out.println("Introdu al doilea numar: ");
        int b = scanner.nextInt();

        int maxim = max(a,b);
        System.out.println("Cel mai mare numar este: " + maxim);

    }
    static int max(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
}
