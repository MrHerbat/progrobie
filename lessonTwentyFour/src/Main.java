import javax.print.DocFlavor;
import javax.swing.text.NumberFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;
import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
//        String inwokacja = "Litwo! Ojczyzno moja! ty jesteś jak zdrowie.\n" +
//                "Ile cię trzeba cenić, ten tylko się dowie,\n" +
//                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
//                "Widzę i opisuję, bo tęsknię po tobie.\n" +
//                "Panno Święta, co Jasnej bronisz Częstochowy\n" +
//                "I w Ostrej świecisz Bramie! Ty, co gród zamkowy\n" +
//                "Nowogródzki ochraniasz z jego wiernym ludem!\n" +
//                "Jak mnie dziecko do zdrowia powróciłaś cudem\n" +
//                "(Gdy od płaczącej matki pod Twoję opiekę\n" +
//                "Ofiarowany, martwą podniosłem powiekę\n" +
//                "I zaraz mogłem pieszo do Twych świątyń progu\n" +
//                "Iść za wrócone życie podziękować Bogu),\n" +
//                "Tak nas powrócisz cudem na Ojczyzny łono.\n" +
//                "Tymczasem przenoś moję duszę utęsknioną\n" +
//                "Do tych pagórków leśnych, do tych łąk zielonych,\n" +
//                "Szeroko nad błękitnym Niemnem rozciągnionych;\n" +
//                "Do tych pól malowanych zbożem rozmaitem,\n" +
//                "Wyzłacanych pszenicą, posrebrzanych żytem;\n" +
//                "Gdzie bursztynowy świerzop, gryka jak śnieg biała,\n" +
//                "Gdzie panieńskim rumieńcem dzięcielina pała,\n" +
//                "A wszystko przepasane, jakby wstęgą, miedzą\n" +
//                "Zieloną, na niej z rzadka ciche grusze siedzą.";

//        String tekst = "知己知彼，百戰不殆。知己知彼，百勝必有敗。如果你既不了解敵人，又不了解自己，那麼每場戰鬥你都會失敗。";
//
//        Map<Character, Integer> numberOfCharacters = new HashMap<>();
//        Map<Character, Double> precetangeOfCharacters = new HashMap<>();
//        double precentageOfChars;
//        char currentChar;
//        for (int i = 0; i < tekst.length(); i++) {
//            currentChar = tekst.charAt(i);
//            numberOfCharacters.merge(currentChar, 1, Integer::sum);
//        }
//        for (char c : numberOfCharacters.keySet()) {
//            precentageOfChars = (double) (Math.round((double) (numberOfCharacters.get(c) * 100000) / tekst.length())) / 100000;
//            precetangeOfCharacters.put(c, precentageOfChars);
//            System.out.println(c + ": " + precentageOfChars + "%");
//        }

//        double num = -532.20d;
//        String numString = numberFormatter(num);
//        System.out.println(numString);
//
//    }

//        String dane = "Maciej Edward Leśniak";
//        String firstname = dane.substring(0,6);
//        String secondname = dane.substring(7,13);
//        String lastname = dane.substring(14,21);
//        System.out.println(firstname);
//        System.out.println(secondname);
//        System.out.println(lastname);

        String email = "lesniak.maciej08@gmail.com";
        System.out.println(email.contains("@"));
//    private static String numberFormatter(double num) {
//        return String.format("|%010.3f|", num);
//    }
    }
}