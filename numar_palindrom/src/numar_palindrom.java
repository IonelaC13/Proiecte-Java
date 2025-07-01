import  java.util.Scanner;

public class numar_palindrom {
    public static void main(String[]arg){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu un numar: ");

        int num= scanner.nextInt();
        int original=num;
        int invers=0;
        int cifra;


        while(num>0){
            cifra = num % 10;
            invers=invers * 10 + cifra;
            num = num / 10;
        }

        System.out.println(num);

        if (invers == original) {
            System.out.println("Numarul este palindrom.");
        } else {
            System.out.println("Numarul nu este palindrom.");
        }
        scanner.close();
    }
}
