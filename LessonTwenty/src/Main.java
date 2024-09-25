public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("Tomasz","Tokaszewicz");
        patient1.leftKidney = patient1.new Kidney(30000d,146d,0.120d);
        patient1.rightKidney = patient1.new Kidney(20000d,120d,0.105d);
        patient1.liver = patient1.new Liver(600000d,5.5d,1.5d);
        System.out.println(patient1.leftKidney.price);
        System.out.println(patient1.rightKidney.price);
        System.out.println(patient1.liver.price);
    }
}