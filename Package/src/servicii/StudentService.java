package servicii;

import modele.Student;

public class StudentService {

    public double calculeazaMedia(Student student) {
        int suma = 0;
        int[] note = student.getNote();

        for (int nota : note) {
            suma += nota;
        }

        return note.length > 0 ? (double) suma / note.length : 0;
    }
}
