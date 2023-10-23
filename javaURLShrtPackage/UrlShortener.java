package javaURLShrtPackage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class UrlShortener extends JFrame {
    private JTextField longURLField;
    private JButton shortenButton;
    private JTextArea resultArea;

    public UrlShortener() {
        setTitle("URL Shortener");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        longURLField = new JTextField();
        shortenButton = new JButton("Shorten URL");
        resultArea = new JTextArea();

        shortenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        UrlShotner urlShortener = new UrlShotner();
        String shortenedURL = urlShortener.shortenUrl(longURL);

        resultArea.setText("Shortened URL: " + shortenedURL);
    }

    

    
}


