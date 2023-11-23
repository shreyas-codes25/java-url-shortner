package javaURLShrtPackage;

import javax.swing.SwingUtilities;

public class Main {
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UrlShortenerGUI gui = new UrlShortenerGUI();
            gui.setVisible(true);
        });
    }
}
