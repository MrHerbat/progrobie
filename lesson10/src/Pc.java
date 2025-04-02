public class Pc extends Komputer{
    int iloscUrzadzenWyjsciaIwejscia;

    public Pc(String nazwaProcesora, double iloscRam, String nazwaGpu, int iloscUrzadzenWyjsciaIWejscia) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.iloscUrzadzenWyjsciaIwejscia = iloscUrzadzenWyjsciaIWejscia;
    }
    @Override
    void wypiszDane()
    {
        super.wypiszDane();
        System.out.println("Ilość urządzeń wyjścia i/lub wejścia: "+ iloscUrzadzenWyjsciaIwejscia);
    }

}
