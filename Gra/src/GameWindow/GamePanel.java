package GameWindow;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements ChangeListener
{
    JPanel colorSelector;
    JSlider rSlider,gSlider,bSlider;
    JButton setColor;
    Color currentColor, playerColor;
    private int r,g,b;
    public GamePanel()
    {
        currentColor = new Color();
        colorSelector  = new JPanel();
        rSlider = new JSlider(0,255,0);
        rSlider.setPreferredSize(new Dimension(255,50));
        rSlider.setOrientation(SwingConstants.HORIZONTAL);
        
        gSlider= new JSlider(0,255,0);
        gSlider.setPreferredSize(new Dimension(255,50));
        gSlider.setOrientation(SwingConstants.HORIZONTAL);
        
        bSlider= new JSlider(0,255,0);
        bSlider.setPreferredSize(new Dimension(255,50));
        bSlider.setOrientation(SwingConstants.HORIZONTAL);

        colorSelector.setLayout(null);
        colorSelector.add(rSlider);
        colorSelector.add(gSlider);
        colorSelector.add(bSlider);

    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.fillRect(100,150,100,100);
        repaint();
    }

    @Override
    public void sateChanged(ChangeEvent e)
    {
        r = rSlider.getValue();
        g = gSlider.getValue();
        b = bSlider.getValue();
        currentColor = new Color(r,g,b);
    }
}
