import java.util.Scanner;

public class array_nr_pare_impare {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);

        int numere[]= new int [10];
        int pare=0;
        int impare=0;

        for(int i=0; i<10; i++){
            System.out.println("Introdu un numar: ");
            numere[i]= scanner.nextInt();
            if( numere[i] % 2 ==0){
                System.out.println("Numarul " +numere[i] + " este par.");
                pare++;
            }
            else{
                System.out.println("Numarul " +numere[i] + " este impar.");
                impare++;

            }
        }
        System.out.println("Total numere pare: " + pare);
        System.out.println("Total numere impare: " + impare);

        scanner.close();
    }
}
