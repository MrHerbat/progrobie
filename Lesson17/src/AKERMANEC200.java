public class AKERMANEC200 implements Kopanie,Uruchamianie{
    @Override
    public void wypoziomujPojazd() {
        System.out.println("Wypoziomowano AKERMANEC200");
    }

    @Override
    public boolean opuszczonoLyzke(double oIle) {
        System.out.println("Opuszczono łyżkę o "+oIle+"m");
        return true;
    }

    @Override
    public boolean podniesionoLyzke(double oIle) {
        System.out.println("Podniesiono łyżkę o "+oIle+"m");
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
    public void kop(double ile) {
        System.out.println("Wykopano "+ile+"m3 ziemi");
    }

    @Override
    public void uruchom() {
        System.out.println("AKERMANEC200 uruchomiony");
    }
}
