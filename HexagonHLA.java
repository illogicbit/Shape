import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class HexagonHLA {
    public static void main(String[] args){
        JFrame window = new JFrame();
        window.setSize(640,480);
        window.setVisible(true);

        Canvas canvas = new Canvas();
        window.add(canvas);
        canvas.setVisible(true);
    }

    static class Canvas extends JPanel{
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            double curX = 200;
            double curY = 50;
            double sideLength = 100;
            double curAngle = 0;
            GeneralPath hex = new GeneralPath(GeneralPath.WIND_EVEN_ODD,6);
            hex.moveTo(curX,curY);
            g2d.setStroke(new BasicStroke(10));

            for(int i = 0; i < 5; i++){
                curX += sideLength * Math.cos(Math.toRadians(curAngle));
                curY += sideLength * Math.sin(Math.toRadians(curAngle));
                curAngle += 60;
                hex.lineTo(curX,curY);
            }
            hex.closePath();
            g2d.draw(hex);
        }
    }
}
