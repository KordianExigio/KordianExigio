package Game;

import javax.swing.*;
import java.awt.*;


public class GamePanel extends JPanel implements  Runnable{

    //Ustawienia Okna
    public final int originalTileSize = 32 ;// 32 x 32 pixele
    final int scale = 2;

    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 30;
    final int maxScreenRow = 22;

    final int screenWidth = maxScreenCol * tileSize;
    final int screenHeight = maxScreenRow * tileSize;

    Thread gameThread;

    GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {

    }
}
