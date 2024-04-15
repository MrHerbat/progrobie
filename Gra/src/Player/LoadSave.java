package Player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Player.*;

public class LoadSave
{
    FileWriter save;

    BufferedReader reader;
    public void SaveGame(Player player)
    {
        try{
            save=new FileWriter("saveFile.txt");
            save.write(player.name+"\n"+player.exp+"\n"+player.classChoice+"\n"+player.currentHp+"\n"+player.equipment.weaponOffHand+"\n"+player.equipment.mainHand+"\n"+player.equipment.armor+"\n"+player.equipment.armorsOffHand);
            save.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
    public String[] LoadGame()
    {
        String[] lines = new String[8];
        int i =0;
        try {
            reader = new BufferedReader(new FileReader("saveFile.txt"));
            lines[i] = reader.readLine();

            while (i<8) {
                i++;
                lines[i] = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
