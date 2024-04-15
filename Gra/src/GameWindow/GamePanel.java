package GameWindow;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel
{
    JPanel colorSelector;
    JSlider rSlider,gSlider,bSlider;
    JButton setColor;
    Color currentColor, newColor;
    private int r,g,b;
    public GamePanel()
    {
       colorSelector  = new JPanel();
       rSlider = new JSlider(0,255,0);
       gSlider= new JSlider(0,255,0);
       bSlider= new JSlider(0,255,0);
       r = rSlider.getValue();
       g = gSlider.getValue();
       b = bSlider.getValue();

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(100,150,100,100);
    }
}
