import java.util.Scanner;

public class nr_prime_interval {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introdu primul numar (start): ");
        int start =scanner.nextInt();

        System.out.println("Introdu al doilea numar (end): ");
        int end = scanner.nextInt();

        afiseazaPrime(start, end);
    }

    static void afiseazaPrime(int start, int end){
        System.out.println("Numerele prime dintre " + start + " și " + end + " sunt:");
        for (int i = start; i <= end; i++){
            if (isPrim(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPrim(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
