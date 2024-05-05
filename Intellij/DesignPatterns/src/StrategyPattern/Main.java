package StrategyPattern;

public class Main {
    public static void main (String[] args){
        System.out.println("Strategy Pattern:");
        var imageStorage = new ImageStorage();
        imageStorage.store("Apple.jpeg", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("Apple.jpeg", new PngCompressor(), new BlackAndWhiteFilter());

    }
}
