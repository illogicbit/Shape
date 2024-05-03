import javax.swing.*;
import java.awt.*;

public class Hexagon {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setBounds(10,10,500,500);
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel pn = new JPanel(){
            @Override
            public void paint(Graphics g) {
                //this makes the program draw the lines smoothly
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //fills the shape with color red
                g2.setColor(Color.red);

                //calculate and return 2d Array of points X, and points Y
                int[][] points = calculatePoints();
                g2.fillPolygon(new Polygon(points[0], points[1], 6));
            }
        };
    fr.add(pn);
    fr.setVisible(true);
    }
    public static int[][] calculatePoints(){
        //2d array that stores array of points in the x-axis and points in the y-axis
        int[][] points = new int[2][3];
        int[] pointX = new int[6]; //stores points in the x-axis
        int[] pointY = new int[6]; //stores points in the y-axis
        for(int i = 0; i < 6; i++){
            //FORMULA ( starting x/y + length of the line + sin/cos(angle) )
            pointX[i] = (int) (100 + 50 * Math.cos(i * 2 * Math.PI / 6));
            pointY[i] = (int) (100 + 50 * Math.sin(i * 2 * Math.PI / 6));
        }
        //Stores the 2 int arrays inside an array
        points[0] = pointX;
        points[1] = pointY;
        return points;
    }

}
