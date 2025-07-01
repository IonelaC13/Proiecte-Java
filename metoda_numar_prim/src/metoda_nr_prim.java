import  java.util.Scanner;

public class metoda_nr_prim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu un numar: ");
        int numar = scanner.nextInt();

        if (estePrim(numar)) {
            System.out.println(numar + " este prim.");
        } else {
            System.out.println(numar + " nu este prim.");
        }
        scanner.close();
    }

    static boolean estePrim(int numar) {
        if(numar < 2 ){
            return false;
        }

        for(int i = 2; i <=Math.sqrt(numar); i++){
            if (numar % i == 0) ;
            {
                return false;
            }
        }
        return true;
    }
}


