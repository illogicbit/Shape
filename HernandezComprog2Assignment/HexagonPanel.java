package HernandezComprog2Assignment;

import HernandezComprog2Assignment.DrawHexagon;

import javax.swing.*;
import java.awt.*;

public class HexagonPanel extends JPanel {
    private final DrawHexagon hexagon;

    //panel
    public HexagonPanel (DrawHexagon hexagon) {
        this.hexagon = hexagon;
        this.setPreferredSize(new Dimension(500, 500));
    }

    //paint
    public void paintComponent (Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        super.paintComponent(g);

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(10));
        g2D.drawPolygon(hexagon.getHexagon());
    }
}
