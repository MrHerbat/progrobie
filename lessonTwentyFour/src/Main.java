import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String inwokacja = "Litwo! Ojczyzno moja! ty jesteś jak zdrowie.\n" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "Widzę i opisuję, bo tęsknię po tobie.\n" +
                "Panno Święta, co Jasnej bronisz Częstochowy\n" +
                "I w Ostrej świecisz Bramie! Ty, co gród zamkowy\n" +
                "Nowogródzki ochraniasz z jego wiernym ludem!\n" +
                "Jak mnie dziecko do zdrowia powróciłaś cudem\n" +
                "(Gdy od płaczącej matki pod Twoję opiekę\n" +
                "Ofiarowany, martwą podniosłem powiekę\n" +
                "I zaraz mogłem pieszo do Twych świątyń progu\n" +
                "Iść za wrócone życie podziękować Bogu),\n" +
                "Tak nas powrócisz cudem na Ojczyzny łono.\n" +
                "Tymczasem przenoś moję duszę utęsknioną\n" +
                "Do tych pagórków leśnych, do tych łąk zielonych,\n" +
                "Szeroko nad błękitnym Niemnem rozciągnionych;\n" +
                "Do tych pól malowanych zbożem rozmaitem,\n" +
                "Wyzłacanych pszenicą, posrebrzanych żytem;\n" +
                "Gdzie bursztynowy świerzop, gryka jak śnieg biała,\n" +
                "Gdzie panieńskim rumieńcem dzięcielina pała,\n" +
                "A wszystko przepasane, jakby wstęgą, miedzą\n" +
                "Zieloną, na niej z rzadka ciche grusze siedzą.";

        Map<Character, Integer> numberOfCharacters = new HashMap<>();
        Map<Character, Double> precetangeOfCharacters = new HashMap<>();
        double precentageOfChars;
        char currentChar;
        for (int i = 0; i < inwokacja.length(); i++) {
            currentChar = inwokacja.charAt(i);
            numberOfCharacters.merge(currentChar, 1, Integer::sum);
        }
        for(char c : numberOfCharacters.keySet()){
            precentageOfChars = (double)(Math.round((double)(numberOfCharacters.get(c)*100000)/inwokacja.length()))/100000;
            precetangeOfCharacters.put(c,precentageOfChars);
            System.out.println(c + ": " + precentageOfChars+"%");
        }
    }
}