//dana

import java.awt.*;
import javax.swing.*;

public class Hexagon {
    public static void mainFrame(){
        Dimension dn = new Dimension(600,600);
        Dimension minDn = new Dimension(150,150);
        JFrame frame = new JFrame("Hexagon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(dn);
        frame.setMinimumSize(minDn);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // 10px border on all sides
        panel.setLayout(new BorderLayout());
        Hex hex = new Hex();

        panel.add(hex, BorderLayout.CENTER);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        mainFrame();
    }
}
class Hex extends JPanel {
    private static Color fillC = new Color(0x6777ed);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Dimension size = getSize();
        int inset = 10;

        int diameter = Math.min(size.width - 2 * inset, size.height - 2 * inset);
        int radius = diameter / 2;

        int[] xS = new int[6];
        int[] yS = new int[6];

        for (int i = 0; i < 6; i++) {
            double angle = Math.PI * i / 3;
            xS[i] = (int) (radius * Math.cos(angle) + size.width / 2.0);
            yS[i] = (int) (radius * Math.sin(angle) + size.height / 2.0);
        }

        Polygon hexagon = new Polygon(xS, yS, 6);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(fillC);
        g2.fillPolygon(hexagon);
    }
}
