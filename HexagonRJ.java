package exercises2.finals;

import javax.swing.*;
import java.awt.*;

public class HexagonRJ extends Canvas{
    //sets the shape's size
    int length = 400;
    //sets the center of the shape
    int x = 350;
    int y = 350;

    public void paint(Graphics g) {
        int [] X = new int[6];
        int [] Y = new int[6];

        //loop to calculate the points at which the line will create an angle
        for(int i = 0;i < 6;i++){
            double angle = i * Math.PI / 3;
            X[i] = x + (int) (Math.cos(angle) * length/2);
            Y[i] = y + (int) (Math.sin(angle) * length/2);
        }
        g.setColor(Color.RED);
        g.fillPolygon(X,Y,6);
    }

    public static void main(String[] args) {
        Shape hexagon = new Shape();
        JFrame frame = new JFrame("Hexagon");
        frame.setSize(700,700);
        frame.add(hexagon);
        frame.setVisible(true);
    }
}

