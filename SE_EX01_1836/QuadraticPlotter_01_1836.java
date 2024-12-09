import javax.swing.*;

public class QuadraticPlotter {

    public static void plotQuadratic() {
        JFrame frame = new JFrame("Quadratic Graph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        plotQuadratic();
    }
}