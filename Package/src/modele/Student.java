package modele;

public class Student {
    private String nume;
    private int[] note;

    public Student(String nume, int[] note) {
        this.nume = nume;
        this.note = note;
    }

    public String getNume() {
        return nume;
    }

    public int[] getNote() {
        return note;
    }

    public void afiseaza() {
        System.out.print("Student: " + nume + ", Notele: ");
        for (int nota : note) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }
}
