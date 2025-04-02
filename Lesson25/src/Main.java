import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regex = "^(?!.*(.).*\\1)[leśniak207]{8}";
        System.out.println(Pattern.matches("[0-9a-zA-Z]{6}", "aa3Gfd"));
        System.out.println(Pattern.matches("[789][789][789]\\d{7}", "8991251751"));
        String haslo;
        System.out.print("Podaj przyklad hasla: ");
        haslo = scan.next();
        if(Pattern.matches(regex, haslo)){
            System.out.println("Haslo byloby dobre!");
        }else{
            System.out.println("Haslo bylo by bledne");
        }

    }
}