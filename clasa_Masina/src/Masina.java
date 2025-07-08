public class Masina {
    String marca;
    String model;
    int anFabricatie;

    public Masina(String marca, String model, int anFabricatie) {
        this.marca = marca;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void afiseazaInformatii() {
        System.out.println("Marca: " + marca + ", Model: " + model + ", An fabricație: " + anFabricatie);
    }
}
