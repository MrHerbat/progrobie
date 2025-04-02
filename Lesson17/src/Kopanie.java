public interface Kopanie
{

        /* public static final */ String nazwa="Koparka";

        /* public abstract */ void wypoziomujPojazd();
        boolean opuszczonoLyzke(double oIle);
        boolean podniesionoLyzke(double oIle);
        void odsunietoLyzke();
        void przysunietoLyzke();
        void obrotWPrawo( double katObrotu);
        void obrotWLewo(double katObrotu);
        void kop(double ile);

        default void makeSound(){
            System.out.println("Wydaje sygnał dźwiękowy");
        }

        static void trabe(){
            System.out.println("Wydaje sygnał dźwiękowy2");
        }
}
