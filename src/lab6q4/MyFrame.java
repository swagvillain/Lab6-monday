/*
This is a program to print a house
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */
package lab6q4;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public MyFrame(){
        setTitle("A House");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation((EXIT_ON_CLOSE));

    }

    @Override
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
