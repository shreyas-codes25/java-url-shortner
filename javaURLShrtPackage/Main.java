package javaURLShrtPackage;

public class Main {
    @Deprecated
    public static void main(String[] args) {
        UrlShotner urlShortener = new UrlShotner();
        String longURL = "https://github.com/shreyas-codes25/all-data-structures-java";
        String shortenedURL = urlShortener.shortenUrl(longURL);

        System.out.println("Shortened URL: " + shortenedURL);
    }
    
}
