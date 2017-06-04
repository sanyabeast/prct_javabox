package swing;

import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import swing.elements.Panel;

public class SwingPaintDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+ SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(800, 600);
        f.add(new Panel());
        f.pack();
        f.setVisible(true);
    }
}
