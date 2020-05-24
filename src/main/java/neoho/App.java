package neoho;

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        final NeoHoFrame frame = new NeoHoFrame();
        SwingUtilities.invokeLater(() -> frame.setVisible(true));
    }
}
