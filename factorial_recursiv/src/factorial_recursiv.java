import java.util.Scanner;

public class factorial_recursiv {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int num = scanner.nextInt();

        int rezultat = factorial(num);
        System.out.println("Factorialul lui " + num + " este: " + rezultat);
        scanner.close();
    }


    public static int factorial(int n){
        if(n == 0|| n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
