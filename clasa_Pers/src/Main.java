public class Main {
    public static void main(String[] args) {
        // Cream două adrese
        Adresa adresa1 = new Adresa("Strada Lalelelor 5", "București", "România");
        Adresa adresa2 = new Adresa("Bulevardul Unirii 10", "Cluj-Napoca", "România");

        // Cream două persoane
        Persoana p1 = new Persoana("Andrei", 25, adresa1);
        Persoana p2 = new Persoana("Maria", 16, adresa2);

        // Afișăm informațiile
        p1.afiseazaInformatii();
        System.out.println(); // Linie goală pentru separare
        p2.afiseazaInformatii();
    }
}
