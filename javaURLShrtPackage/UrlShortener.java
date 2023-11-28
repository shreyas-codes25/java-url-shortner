package javaURLShrtPackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class UrlShortener {
    private Map<String, String> shortToLongMap;
    private Map<String, String> longToShortMap;
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;
    public UrlShortener() {
        this.shortToLongMap = new HashMap<>();
        this.longToShortMap = new HashMap<>();
    }

    public String shortenUrl(String originalUrl) {
        if (longToShortMap.containsKey(originalUrl)) {
            return longToShortMap.get(originalUrl);
        }

        String shortCode = generateShortCode();
        shortToLongMap.put(shortCode, originalUrl);
        longToShortMap.put(originalUrl, shortCode);

        return shortCode;
    }

    public String getOriginalUrl(String shortCode) {
        return shortToLongMap.get(shortCode);
    }

    private String generateShortCode() {
        StringBuilder shortCode = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < CODE_LENGTH; i++) {
            int randomIndex = random.nextInt(CHARACTERS.length());
            shortCode.append(CHARACTERS.charAt(randomIndex));
        }

        return shortCode.toString();
    }

    public static void main(String[] args) {
        UrlShortener urlShortener = new UrlShortener();

        String originalUrl = "https://docs.google.com/forms/d/e/1FAIpQLSfDe0FDK1VDpmSmtWSqEmrl-fTFK7wAcXYdn7E2rPz-IIzrag/viewform?usp=sf_link ";
        String shortUrl = urlShortener.shortenUrl(originalUrl);

        System.out.println("Original URL: " + originalUrl);
        System.out.println("Short URL: " + shortUrl);

//        String retrievedUrl = urlShortener.getOriginalUrl(shortUrl);
  //      System.out.println("Retrieved URL: " + retrievedUrl);
    }
}
