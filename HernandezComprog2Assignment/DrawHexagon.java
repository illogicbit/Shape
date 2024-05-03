package HernandezComprog2Assignment;

import java.awt.*;

public class DrawHexagon {
    private final int radius;
    private final Point center;
    private final Polygon hexagon;

    //initialize
    public DrawHexagon(Point center, int radius){
        this.center = center;
        this.radius = radius;
        this.hexagon = createHexagon();
    }

    //create the hexagon lines
    public Polygon createHexagon(){
        Polygon polygon = new Polygon();

        for (int i = 0; i < 6; i++){
            int x =  (int) (center.x + radius * Math.cos(i * 2 * Math.PI/6D));
            int y = (int) (center.y + radius * Math.sin(i * 2 * Math.PI/6D));
            polygon.addPoint(x,y);
        }
        return polygon;
    }

    //getters
    public int getRadius(){
        return radius;
    }


    public Point getCenter(){
        return center;
    }


    public Polygon getHexagon(){
        return hexagon;
    }
}
