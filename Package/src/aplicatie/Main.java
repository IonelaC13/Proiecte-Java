package aplicatie;

import modele.Student;
import servicii.StudentService;

public class Main {
    public static void main(String[] args) {
        int[] noteAndrei = {9, 8, 10, 7};
        Student andrei = new Student("Andrei", noteAndrei);

        andrei.afiseaza();

        StudentService service = new StudentService();
        double media = service.calculeazaMedia(andrei);

        System.out.printf("Media notelor pentru %s este: %.2f%n", andrei.getNume(), media);
    }
}
