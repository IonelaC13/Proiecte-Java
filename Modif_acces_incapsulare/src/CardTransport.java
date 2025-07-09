public class CardTransport {
    private String titular;
    private double credit;
    private String tipAbonament;


    public CardTransport(String titular, double credit, String tipAbonament) {
        this.titular = titular;
        this.credit = credit;
        this.tipAbonament = tipAbonament;
    }


    public String getTitular() {
        return titular;
    }

    public double getCredit() {
        return credit;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }


    public void incarcaCredit(double suma) {
        if (suma > 0) {
            credit += suma;
            System.out.println("Credit incarcat: " + suma + " lei. Credit actual: " + credit);
        } else {
            System.out.println("Suma introdusă nu este validă.");
        }
    }


    public void valideazaCalatorie(double cost) {
        if (cost <= credit && cost > 0) {
            credit -= cost;
            System.out.println("Calatorie validata. S-a retras " + cost + " lei.");
        } else {
            System.out.println("Fonduri insuficiente sau cost invalid.");
        }
    }


    public void afiseazaInformatii() {
        System.out.println("=== Informații card ===");
        System.out.println("Titular: " + titular);
        System.out.println("Tip abonament: " + tipAbonament);
        System.out.println("Credit disponibil: " + credit + " lei");
    }
}
