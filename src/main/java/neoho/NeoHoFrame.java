package neoho;

import javax.swing.*;
import java.awt.*;

public class NeoHoFrame extends JFrame {

    public NeoHoFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("NeoHo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(640, 480);

        final Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((screenDimension.width-640)/2, (screenDimension.height-480)/2);

        final JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        String pathToResource = "/neoho/fcn.png";

        final JLabel iconLabel = new JLabel();
        System.out.println(NeoHoFrame.class.getResource(pathToResource));
        iconLabel.setIcon(new ImageIcon(NeoHoFrame.class.getResource(pathToResource)));

        mainPanel.add(iconLabel, BorderLayout.CENTER);
        getContentPane().add(mainPanel);
    }
}
