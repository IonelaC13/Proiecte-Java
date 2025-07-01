import java.util.Scanner;

public class nr_perf_patrate {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu un numar: ");

        int num=scanner.nextInt();

        System.out.println("Pătratele perfecte mai mici sau egale cu numarul introdus: ");
        for(int i = 1; i * i <= num; i++){
         System.out.println(i*i);
        }
        scanner.close();
    }
}
