public class Persoana {
    String nume;
    int varsta;
    Adresa adresa; // Compoziție

    public Persoana(String nume, int varsta, Adresa adresa) {
        this.nume = nume;
        this.varsta = varsta;
        this.adresa = adresa;
    }

    public void afiseazaInformatii() {
        System.out.println("Nume: " + nume + ", Vârstă: " + varsta + " ani");
        adresa.afiseazaAdresa();
        System.out.println("Este major: " + (esteMajor() ? "Da" : "Nu"));
    }

    public boolean esteMajor() {
        return varsta >= 18;
    }
}
