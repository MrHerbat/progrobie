public class CATERPILLARM318D implements Kopanie,Uruchamianie{
    @Override
    public void wypoziomujPojazd() {
        System.out.println("Wypoziomowano CATERPILLARM318D");
    }

    @Override
    public boolean opuszczonoLyzke(double oIle) {
        return true;
    }

    @Override
    public boolean podniesionoLyzke(double oIle) {
        return false;
    }

    @Override
    public void odsunietoLyzke() {
        System.out.println("Odsunięto łyżkę");
    }

    @Override
    public void przysunietoLyzke() {
        System.out.println("Przesunięto łyżkę");
    }

    @Override
    public void obrotWPrawo(double katObrotu) {
        System.out.println("Obrócono w prawo o "+katObrotu+" stopni");
    }

    @Override
    public void obrotWLewo(double katObrotu) {
        System.out.println("Obrócono w lewo o "+katObrotu+" stopni");
    }

    @Override
    public void uruchom() {
        System.out.println("CATERPILLARM318D uruchomiony");
    }
}
