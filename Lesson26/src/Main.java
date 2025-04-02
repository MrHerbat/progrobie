import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Byte> ChangeArrayToByteArray(ArrayList<Integer> x){
        ArrayList<Byte> b = new ArrayList<Byte>();
        String tempString;
        char[] tempChar;
        for (int i = 0; i < x.size(); i++) {
            tempString = x.get(i).toString();
            tempChar = tempString.toCharArray();
            for (int j = 0; j < tempChar.length; j++) {
                b.add((byte)tempChar[j]);
            }
        }
        return b;
    }
    public static ArrayList<Integer> GetIntArrayFromFile(String filePath) throws IOException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        try {
            String content = Files.readString(Paths.get(filePath));
            Arrays.stream(content.trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .forEach(list::add);
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
        }
        return list;
    }
    public static void OutputArrayToFile(String outputFilePath, ArrayList<Byte> byteArrayList) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
        for (int i = 0; i < byteArrayList.size(); i++) {
            fileOutputStream.write(byteArrayList.get(i));

            int position = i + 1;
            if (position >= 5 && position % 5 == 0) {
                fileOutputStream.write(position % 10 == 0 ? (byte)'\n' : (byte)' ');
            }
        }
        try {
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args){
        try {

            ArrayList<Integer> numbersContainer = GetIntArrayFromFile("input.txt");
            for (int i = 0; i < numbersContainer.size(); i++) {
                if (i%2==0){
                    numbersContainer.set(i,numbersContainer.get(i)+1);
                }else{
                    numbersContainer.set(i,numbersContainer.get(i)+2);
                }
            }


            File albumFile = new File("Data.txt");
            Scanner fileScaner = new Scanner(albumFile);
            ArrayList<Albums> albumsArrayList = new ArrayList<>();
            while(fileScaner.hasNext()){
                Albums album = new Albums();
                album.artist = fileScaner.nextLine();
                album.album = fileScaner.nextLine();
                album.songsNumber = Integer.parseInt(fileScaner.nextLine());
                album.year = Integer.parseInt(fileScaner.nextLine());
                album.downloadNumber = Long.parseLong(fileScaner.nextLine());
                if(fileScaner.hasNext()){
                    fileScaner.nextLine();
                }
                albumsArrayList.add(album);
            }
            for(Albums albums : albumsArrayList){
                System.out.println(albums.toString());
            }


            OutputArrayToFile("output.txt", ChangeArrayToByteArray(numbersContainer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}