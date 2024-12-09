import javax.swing.*;
import java.awt.*;

public class QuadraticPlotter {

    public static void plotQuadratic() {
        JFrame frame = new JFrame("Quadratic Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new QuadraticGraph());
        frame.setVisible(true);
    }

    static class QuadraticGraph extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            // Draw axes
            g2d.drawLine(0, height / 2, width, height / 2); // X-axis
            g2d.drawLine(width / 2, 0, width / 2, height); // Y-axis
        }
    }

    public static void main(String[] args) {
        plotQuadratic();
    }
}