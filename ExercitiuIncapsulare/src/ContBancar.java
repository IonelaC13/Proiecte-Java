public class ContBancar {
    private String titular;
    private double sold;

    public ContBancar(String titular, double soldInitial) {
        this.titular = titular;
        this.sold = soldInitial;
    }

    public String getTitular() {
        return titular;
    }

    public double getSold() {
        return sold;
    }

    public void depoziteaza(double suma) {
        if (suma > 0) {
            sold += suma;
            System.out.println("Depunere reușită: " + suma + " lei.");
        } else {
            System.out.println("Suma trebuie să fie pozitivă.");
        }
    }

    public void retrage(double suma) {
        if (suma <= sold && suma > 0) {
            sold -= suma;
            System.out.println("Retragere reușită: " + suma + " lei.");
        } else {
            System.out.println("Retragere nereușită. Fonduri insuficiente sau sumă invalidă.");
        }
    }
}
