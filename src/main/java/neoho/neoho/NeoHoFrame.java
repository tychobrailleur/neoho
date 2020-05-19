package neoho;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

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

        String pathToResource = "/neoho/fcn.png"; // Correct path for packaged app
        URL url = getImageUrl(pathToResource);

        final JLabel iconLabel = new JLabel();
        System.out.println(String.format("Image URL: %s", url.toExternalForm()));
        iconLabel.setIcon(new ImageIcon(url));

        mainPanel.add(iconLabel, BorderLayout.CENTER);
        getContentPane().add(mainPanel);
    }

    private URL getImageUrl(String path) {
        URL url = NeoHoFrame.class.getResource(path);
        if (url == null) {
            try {
                // This is a shameless hack to get resources to load from IntelliJ.
                return new File("./src/main/resources" + path).toURI().toURL();
            } catch (MalformedURLException e) {
                // At this point this is hopeless.
                e.printStackTrace();
            }
        }
        return url;
    }
}
