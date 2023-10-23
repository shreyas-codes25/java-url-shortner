package javaURLShrtPackage;

import javax.swing.SwingUtilities;

public class Main {
  
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UrlShortener gui = new UrlShortener();
            gui.setVisible(true);
        });
    }
}
