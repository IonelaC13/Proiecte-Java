import java.util.Scanner;

public class divizorii_nr_dat {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu un numar intreg pozitiv: ");
         int num = scanner.nextInt();

        System.out.println("Afisam toti divizorii numarului ales: ");
        for(int i= 1; i <= num; i++){
            if( num % i == 0){
           System.out.println(i);
            }
        }
        scanner.close();
    }
}
