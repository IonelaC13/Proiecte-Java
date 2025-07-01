import java.util.Scanner;

public class verif_nr_perfect {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti un numar: ");

        int num= scanner.nextInt();

        int sum=0;
        System.out.println("Afseaza toti divizorii numarului ales.");
        for (int i = 1; i < num; i++){
            if(num % i == 0)
                System.out.println(i);
             sum += i;
        }
        System.out.println("Suma divizorilor este: " + sum);

        if(sum == num){
            System.out.println("Numarul este perfect.");
        }
        else{
            System.out.println("Numarul nu este perfect.");
        }
        scanner.close();
    }
}
