package lab6q5;

import java.awt.*;

public class House {

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int[] xs = new int[3];
        int[] ys = new int[3];

        xs[0] = 30;
        xs[1] = 82;
        xs[2] = 135;

        ys[0] = 95;
        ys[1] = 60;
        ys[2] = 95;

        g2d.setColor(new Color(200, 200, 50));
        g2d.fillRect(45, 90, 75, 75);

        g2d.setColor(new Color(100, 200, 50));
        g2d.fillRect(55, 135, 15, 30);

        g2d.setColor(new Color(180, 80, 80));
        g2d.fillPolygon(xs, ys, 3);
    }



}
