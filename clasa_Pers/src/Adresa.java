public class Adresa {
    String strada;
    String oras;
    String tara;

    public Adresa(String strada, String oras, String tara) {
        this.strada = strada;
        this.oras = oras;
        this.tara = tara;
    }

    public void afiseazaAdresa() {
        System.out.println("Adresa: " + strada + ", " + oras + ", " + tara);
    }
}
