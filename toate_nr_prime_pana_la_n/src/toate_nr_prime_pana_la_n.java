import java.util.Scanner;

public class toate_nr_prime_pana_la_n {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu un numar intreg: ");

        int num= scanner.nextInt();
        boolean numestePrim= true;
        System.out.println("Numere prime între 2 și " + num + ":");

        for(int i=2; i<=num; i++) {

                numestePrim = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    numestePrim = false;
                    break;
                }
            }
            System.out.println(i);
        }


        scanner.close();
    }
}
