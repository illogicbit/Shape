import javax.swing.*;
import java.awt.*;

public class HexagonIsBestagon extends JFrame {

    private final JPanel panel = new JPanel();

    public static void main(String[] args) {
        new Frame().setVisible(true);
    }

    public HexagonIsBestagon() {
        //Percent of the screen that the frame will take up (default is 50% of the screen).
        double multiplier = 0.50;
        //Get screen size and set frame size to a % of the screen.
        Dimension getScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = new Dimension((int) (getScreenSize.width * multiplier), (int) (getScreenSize.height * multiplier));
        setSize(frameSize.width, frameSize.height);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null); //Center frame on screen
        add(new Canvas()); //Add the shape to the frame

    }
}

class Canvas extends JComponent{
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int horizontalCenter = getWidth() / 2;
        int verticalCenter = getHeight() / 2;
        int radius = (int) (getHeight() * 0.3);
        int sides = 6; //Change sides to change the polygon

        int[] xPoints = new int[sides];
        int[] yPoints = new int[sides];
        for (int i = 0; i < sides; i++) {
            xPoints[i] = (int) (horizontalCenter + radius * Math.cos(2 * Math.PI * i / sides));
            yPoints[i] = (int) (verticalCenter + radius * Math.sin(2 * Math.PI * i / sides));
        }

        g2d.drawPolygon(xPoints, yPoints, sides);
        g2d.setColor(Color.BLACK);
    }
}
