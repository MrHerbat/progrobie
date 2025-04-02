import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        FileInputStream fileInputStream = new FileInputStream(filePath);
        BufferedInputStream bfileInputStream = new BufferedInputStream(fileInputStream);
        Scanner fileScan = new Scanner(bfileInputStream);

        while (fileScan.hasNext()) {
            list.add(fileScan.nextInt());
        }
        try {
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;

    }
    public static void OutputArrayToFile(String outputFilePath, ArrayList<Byte> byteArrayList) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);
        for (int i = 0; i < byteArrayList.size(); i++) {
            fileOutputStream.write(byteArrayList.get(i));

            if((i==4 || i>=5) && (i+1)%5==0 && (i+1)%10!=0){
                fileOutputStream.write((byte)' ');
            }else if((i+1)>=10 && (i+1)%10==0){
                fileOutputStream.write((byte)'\n');
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
            Stream<String> album = Files.lines(Path.of("Data.txt"));
            album.forEach(System.out::println);
            OutputArrayToFile("output.txt", ChangeArrayToByteArray(numbersContainer));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}