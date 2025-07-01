import java.util.Scanner;

public class supraincarcarea_metodelor {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Introdu primul numar intreg: ");
        int a = scanner.nextInt();
        System.out.println("Introdu al doilea numar intreg: ");
        int b = scanner.nextInt();

        System.out.println("Introdu primul numar zecimal: ");
        double x= scanner.nextDouble();
        System.out.println("Introdu al doilea numar zecimal: ");
        double y= scanner.nextDouble();

        System.out.println("Introdu al treilea numar intreg: ");
        int c= scanner.nextInt();

        System.out.println("Suma a + b + c = " + sum(a,b,c));
        System.out.println("Suma x + y = " + sum(x, y));
        System.out.println("Suma a + b + c = " + sum(a, b, c));

        scanner.close();
    }
    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double x, double y){
        return x + y;
    }

    public  static int sum(int a, int b, int c){
         return a+b+c;
    }
}

