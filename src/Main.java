public class Main {
    public static void main(String[] args) {
        Client Bex = new Client("Bex");
        Client Aset = new Client("Aset");
        Client Sayat = new Client("Sayat");
        Client Tokaev = new Client("Kasym-Jomart-Tokaev");

        Shop Tapki = new Shop("Tapki");

        Tapki.addSub(Bex);
        Tapki.addSub(Aset);
        Tapki.addSub(Sayat);
        Tapki.addSub(Tokaev);

        Bex.getNewsFrom(Tapki);
        Aset.getNewsFrom(Tapki);
        Sayat.getNewsFrom(Tapki);
        Tokaev.getNewsFrom(Tapki);

        Tapki.launchNewProduct();
    }
}