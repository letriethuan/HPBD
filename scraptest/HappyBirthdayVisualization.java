package scraptest;

import javax.swing.*;
import java.awt.*;

public class HappyBirthdayVisualization extends JPanel {

    // Method to draw the birthday message and some decorations
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set background color
        this.setBackground(Color.PINK);

        // Draw a birthday cake (simple rectangle with candles)
        g.setColor(Color.ORANGE);
        g.fillRect(100, 200, 200, 100); // Cake

        g.setColor(Color.YELLOW);
        g.fillRect(140, 170, 20, 30); // Candle 1
        g.fillRect(240, 170, 20, 30); // Candle 2

        g.setColor(Color.RED);
        g.drawString("Happy Birthday!NGOC PHUC", 110, 100); // Message

        // Draw balloons (circles with strings)
        g.setColor(Color.BLUE);
        g.fillOval(50, 50, 50, 70); // Balloon 1
        g.drawLine(75, 120, 75, 180); // String 1

        g.setColor(Color.GREEN);
        g.fillOval(300, 50, 50, 70); // Balloon 2
        g.drawLine(325, 120, 325, 180); // String 2
    }

    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame frame = new JFrame("Birthday Visualization");

        // Add the custom panel to the frame
        HappyBirthdayVisualization panel = new HappyBirthdayVisualization();
        frame.add(panel);

        // Set frame properties
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
