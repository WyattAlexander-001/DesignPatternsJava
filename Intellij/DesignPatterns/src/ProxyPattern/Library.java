package ProxyPattern;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebooks = new HashMap<>();

    public void add(Ebook ebook){
        ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        Ebook ebook = ebooks.get(fileName);
        if (ebook != null) {
            ebook.show();
        } else {
            System.out.println("No ebook found with the fileName: " + fileName);
        }
    }
}
