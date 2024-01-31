public class Telefon extends Komputer{
    boolean czyIphone;

    public Telefon(String nazwaProcesora, double iloscRam, String nazwaGpu, boolean czyIphone) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.czyIphone = czyIphone;
    }
    @Override
    void wypiszDane()
    {
        super.wypiszDane();
        System.out.println("Czy jest to IPhone? "+(czyIphone?"Tak":"Nie"));
    }
}
