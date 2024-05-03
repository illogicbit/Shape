package HernandezComprog2Assignment;

import javax.swing.*;
import java.awt.*;

public class HexagonMain extends JFrame {
    private HexagonPanel hexagonPanel;

    //frame
    public HexagonMain(){
        super("Draw Hexagon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawHexagon hexagon = new DrawHexagon(new Point(250, 250), 200);

        hexagonPanel = new HexagonPanel(hexagon);
        add(hexagonPanel);

        pack();
        setLocationByPlatform(true);
        setVisible(true);
        setResizable(false);
    }

    //main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HexagonMain();
            }
        });
    }
}
