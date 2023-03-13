package lab6q3;/*
This is a program to print a 2 overlapping squares, one yellow and one green
@author Marshall Brown 230158096
CPSC101 Winter Semester 2023, Lab 6
 */
//package lab6q3;
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{

    public MyFrame(){
        setTitle("A Couple Squares");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation((EXIT_ON_CLOSE));

    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(00, 255, 00));
        g2d.fillRect(105, 80, 100, 100);

        g2d.setColor(new Color(255, 255, 00));
        g2d.fillRect(45, 90, 75, 75);
    }

}
