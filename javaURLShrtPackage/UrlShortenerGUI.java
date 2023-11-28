package javaURLShrtPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UrlShortenerGUI extends JFrame {
    private JTextField longURLField;
    private JButton shortenButton;
    private JTextArea resultArea;
    public UrlShortenerGUI() {
        setTitle("URL Shortener");
        setSize(550, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        longURLField = new JTextField();
        longURLField.setSize(10,50);
        longURLField.setColumns(30);
        shortenButton = new JButton("Shorten URL");
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        shortenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultArea.cut();
                shortenURL();
            }
        });
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Long URL: "));
        inputPanel.add(longURLField);
        inputPanel.add(shortenButton);
        add(inputPanel, BorderLayout.NORTH);
        add(resultArea, BorderLayout.CENTER);
    }
    @Deprecated
    private void shortenURL() {
        String longURL = longURLField.getText();
        UrlShortener urlShortener = new UrlShortener();
        String shortenedURL = urlShortener.shortenUrl(longURL);
        resultArea.setText("Shortened URL: " + shortenedURL);
    }
 

    
}


