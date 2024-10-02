package Game;
import javax.swing.*;
import java.awt.*;

public class gameMain {
    JFrame window;
    static GraphicsDevice device = GraphicsEnvironment
            .getLocalGraphicsEnvironment().getScreenDevices()[0];
    public gameMain(String[] UserData){
        window = new JFrame("SpaceInvaders");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);


        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);


        System.out.println("<---------------->");
        System.out.println("Utworzono okienko");
        System.out.println("User ID: " + Integer.parseInt(UserData[0]));
        System.out.println("User name: " + UserData[1]);
        System.out.println("<---------------->");
    }

}
