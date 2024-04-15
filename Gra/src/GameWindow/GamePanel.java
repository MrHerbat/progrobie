package GameWindow;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements ChangeListener
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
        rSlider.setPreferredSize(new Dimension(255,50));
        
        gSlider= new JSlider(0,255,0);
        gSlider.setPreferredSize(new Dimension(255,50));
        
        bSlider= new JSlider(0,255,0);
        bSlider.setPreferredSize(new Dimension(255,50));
        
        r = rSlider.getValue();
        g = gSlider.getValue();
        b = bSlider.getValue();

        colorSelector.setLayout(null);
        colorSelector.add(rSlider);
        colorSelector.add(gSlider);
        colorSelector.add(bSlider);

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(100,150,100,100);
    }

    @Override
    public void sateChanged(ChangeEvent e)
    {
        
    }
}
