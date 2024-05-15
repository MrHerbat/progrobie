package Window;

import java.awt.*;

public class Game implements Runnable
{
    private Panels panel;
    private Thread gameThread;
    private final int FPS_SET=60;

    public Game()
    {
        panel = new Panels();
        startGameLoop();
    }
    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        double timePerFrame = 1000000000.0/FPS_SET;
        long lastFrame = System.nanoTime();
        int fps = 0;
        long now = System.nanoTime();
        long lastCheck=System.currentTimeMillis();
        while(true)
        {
            now = System.nanoTime();
            if(now-lastFrame >= timePerFrame)
            {
                panel.repaint();
                lastFrame = System.nanoTime();
                fps++;
            }
            if(System.currentTimeMillis() - lastCheck >=1000)
            {
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: "+fps);
                fps=0;
            }
        }
    }
}
