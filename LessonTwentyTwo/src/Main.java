import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House dom1 = new House();
        dom1.fillTheHouse();
        System.out.println(dom1.toString());

        House dom2 = new House();
        dom2.fillTheHouse();
        System.out.println(dom2.toString());

    }
}