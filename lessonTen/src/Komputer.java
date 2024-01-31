public class Komputer
{
    String nazwaProcesora;
    double iloscRam;
    String nazwaGpu;

    public Komputer(String nazwaProcesora, double iloscRam, String nazwaGpu) {
        this.nazwaProcesora = nazwaProcesora;
        this.iloscRam = iloscRam;
        this.nazwaGpu = nazwaGpu;
    }

    void wypiszDane()
    {
        System.out.println("Nazwa procesora: "+nazwaProcesora);
        System.out.println("Ilość RAMu: "+iloscRam);
        System.out.println("Nazwa GPU: "+nazwaGpu);
    }
}
