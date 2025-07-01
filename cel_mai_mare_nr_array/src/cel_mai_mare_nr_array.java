import java.util.Scanner;

public class cel_mai_mare_nr_array {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int numere[] = new int[5];
        int max=0;

        for(int i=0; i<5; i++){
            System.out.println("Introdu un numar: ");
            numere[i]= scanner.nextInt();
            if (i == 0 || numere[i] > max) {
                max = numere[i];
            }
        }
        System.out.println("Valoarea max:" + max);
        scanner.close();
    }
}
