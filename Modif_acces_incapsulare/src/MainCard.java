public class MainCard {
    public static void main(String[] args) {
        CardTransport card = new CardTransport("Ioana Ionescu", 15.0, "Urban");


        card.incarcaCredit(10.0);
        card.valideazaCalatorie(3.5);
        card.valideazaCalatorie(30.0);


        card.afiseazaInformatii();
    }
}
