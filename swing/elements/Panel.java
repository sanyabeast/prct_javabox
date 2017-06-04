package swing.elements;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class Panel extends JPanel {

    public Panel() {
        setBorder(BorderFactory.createLineBorder(Color.red));
    }

    public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println(Color.red);
        // Draw Text
        g.drawString("I love Java!", 10, 30);
    }
}
