public class MainCont {
    public static void main(String[] args) {
        ContBancar cont = new ContBancar("Elena Popescu", 1000.0);

        System.out.println("Titular: " + cont.getTitular());
        System.out.println("Sold inițial: " + cont.getSold() + " lei");

        cont.depoziteaza(500.0);
        System.out.println("Sold după depunere: " + cont.getSold() + " lei");

        cont.retrage(300.0);
        System.out.println("Sold după retragere: " + cont.getSold() + " lei");

        cont.retrage(2000.0); // test pentru retragere invalidă
    }
}
