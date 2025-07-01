import java.util.Scanner;

public class numar_prim {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu un numar: ");
        int num = scanner.nextInt();


        boolean numestePrim = true;

        if(num <2){
            numestePrim=false;
    }
        else {
            for(int i=2; i<num; i++){
                if(num % i==0){
                    numestePrim=false;
                    break;
                }
            }
        }
    if(numestePrim){
        System.out.println("Numarul este prim.");
    }
    else {
        System.out.println("Numarul nu este prim.");
    }
    scanner.close();

    }
}
