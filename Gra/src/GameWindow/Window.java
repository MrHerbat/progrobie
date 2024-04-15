package GameWindow;

import javax.swing.*;

public class Window
{
    JFrame jf;
    public Window(GamePanel panel)
    {
        jf = new JFrame();
        jf.pack();
        jf.setTitle("Hexagon:Corruption");
        jf.setResizable(false);
        jf.setSize(900,600);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);


        jf.add(panel);

        jf.setVisible(true);
    }
}
