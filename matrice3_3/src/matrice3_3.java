import java.util.Scanner;

public class matrice3_3 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        int matrice[][]= new int[3][3];


        for(int i=0; i < 3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Introdu un numar pentru [" + i + "][" + j + "]: ");
                matrice[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatricea este: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println(matrice[i][j] + " ");
            }
            System.out.println();
        }
       scanner.close();
    }
}
