import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String regex = "^(?![^l]*l[^l]*l)(?![^e]*e[^e]*e)(?![^ś]*ś[^ś]*ś)(?![^n]*n[^n]*n)(?![^i]*i[^i]*i)(?![^a]*a[^a]*a)(?![^k]*k[^k]*k).{8}$";
        System.out.println(Pattern.matches("[0-9a-zA-Z]{6}", "aa3Gfd"));
        System.out.println(Pattern.matches("[789][789][789]\\d{7}", "8991251751"));
        System.out.println(Pattern.matches(regex, "liae07śk"));

    }
}