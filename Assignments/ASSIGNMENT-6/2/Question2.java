 import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

/* 
  <applet code="Question2" width="600" height="400"></applet>
*/

class Question2 extends Applet implements ActionListener {
    // Variables for animation
    int circleX = 50;
    int circleY = 250;
    int xSpeed = 5;
    Timer timer;

    public void init() {
        // Initialize the timer for animation (updates every 50 milliseconds)
        timer = new Timer(50, this);
        timer.start();
    }

    public void paint(Graphics g) {
        // 1. Draw a Rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 60);
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 100, 60);

        // 2. Draw a Circle (Oval)
        g.setColor(Color.BLUE);
        g.fillOval(200, 50, 70, 70);

        // 3. Draw a Line
        g.setColor(Color.BLACK);
        g.drawLine(50, 150, 300, 150);

        // 4. Draw a Polygon (Triangle)
        g.setColor(Color.GREEN);
        int[] xPoints = {400, 450, 350};
        int[] yPoints = {50, 150, 150};
        g.fillPolygon(xPoints, yPoints, 3);

        // 5. Use different Fonts
        g.setColor(Color.MAGENTA);
        g.setFont(new Font("Serif", Font.BOLD, 24));
        g.drawString("Shapes and Animation", 50, 200);
        
        g.setFont(new Font("Monospaced", Font.ITALIC, 15));
        g.drawString("By Beginner Student", 50, 220);

        // 6. Simple Animation (Moving Circle)
        g.setColor(Color.ORANGE);
        g.fillOval(circleX, circleY, 50, 50);
        g.setColor(Color.BLACK);
        g.drawOval(circleX, circleY, 50, 50);
    }

    // This method is called by the Timer every 50ms
    public void actionPerformed(ActionEvent e) {
        // Move the circle
        circleX += xSpeed;

        // Bounce back if it hits the wall
        if (circleX > getWidth() - 50 || circleX < 0) {
            xSpeed = -xSpeed;
        }

        // Redraw the applet
        repaint();
    }
}
