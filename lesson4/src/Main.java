public class Main {
    public static void main(String[] args)
    {
//        Scanner scan = new Scanner(System.in);
//        Triangle triangle = new Triangle();
//        TrojmianKwadratowy trojmian = new TrojmianKwadratowy();
//
//        System.out.print("Podaj pierwsza liczbę: ");
//        int sideA = scan.nextInt();
//        System.out.print("Podaj trzecia liczbę: ");
//        int sideB = scan.nextInt();
//        System.out.print("Podaj czwarta liczbę: ");
//        int sideC = scan.nextInt();
//
//
//        System.out.println("Obwod trojkata o bokach: "+sideA+", "+sideB+", "+sideC+" wynosi: "+triangle.whatIsTriangleCircumference(sideA,sideB,sideC));
//        System.out.println();
//        System.out.println();
//        System.out.print("Podaj a: ");
//        double a = scan.nextInt();
//        System.out.print("Podaj b: ");
//        double b = scan.nextInt();
//        System.out.print("Podaj c: ");
//        double c = scan.nextInt();
//        System.out.println("Delta z liczb: "+a+", "+b+", "+c+" wynosi: "+trojmian.calculateDelta(a,b,c));

        Student uczen = new Student("Maciej","Leśniak");
        Square kwadrat = new Square("Red", 6.25);
        Ship statek = new Ship("Maria", 15);
        System.out.println(uczen.name+" "+uczen.lastname);
        System.out.println(kwadrat.color +" "+kwadrat.area);
        System.out.println(statek.name+" "+statek.shipLengthInMeters);
    }
}