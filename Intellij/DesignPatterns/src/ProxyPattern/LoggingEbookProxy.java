package ProxyPattern;

public class LoggingEbookProxy implements Ebook{
    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null){
            ebook = new RealEbook(fileName);
        }
        System.out.println("LOGGGGGGGGGGGIIIIIINNNNNGG!");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
