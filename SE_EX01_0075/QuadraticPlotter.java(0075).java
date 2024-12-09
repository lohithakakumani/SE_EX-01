
import javax.swing.*;
import java.awt.*;

public class QuadraticPlotter {

    public static void plotQuadratic(double a, double b, double c) {
        JFrame frame = new JFrame("Quadratic Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new QuadraticGraph(a, b, c));
        frame.setVisible(true);
    }

    static class QuadraticGraph extends JPanel {
        private final double a, b, c;

        public QuadraticGraph(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();

            // Draw axes
            g2d.drawLine(0, height / 2, width, height / 2); // X-axis
            g2d.drawLine(width / 2, 0, width / 2, height); // Y-axis

            // Plot quadratic y = ax^2 + bx + c
            g2d.setColor(Color.RED);
            for (int xPixel = 0; xPixel < width; xPixel++) {
                double x = (xPixel - width / 2) / 20.0;
                double y = a * x * x + b * x + c;
                int yPixel = (int) (height / 2 - y * 20);

                if (xPixel > 0) {
                    g2d.drawLine(xPixel - 1, prevY, xPixel, yPixel);
                }
                prevY = yPixel;
            }
        }

        private int prevY;
    }

    public static void main(String[] args) {
        plotQuadratic(1, -2, 1); // Customizable coefficients
    }
}
