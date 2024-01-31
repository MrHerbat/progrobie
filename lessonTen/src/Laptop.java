public class Laptop extends Komputer{
    boolean czyMaTrackPoint;

    public Laptop(String nazwaProcesora, double iloscRam, String nazwaGpu, boolean czyMaTrackPoint) {
        super(nazwaProcesora, iloscRam, nazwaGpu);
        this.czyMaTrackPoint = czyMaTrackPoint;
    }

    @Override
    void wypiszDane() {
        super.wypiszDane();
        System.out.println("Czy ma TrackPoint? "+(czyMaTrackPoint?"Tak":"Nie"));
    }

}
