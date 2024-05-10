package BuilderPattern;

public class Main {
    public static void main (String[] args){
        var pres = new Presentation();
        pres.addSlides(new Slide("SLide 1"));
        var builder = new PdfDocumentBuilder();
        pres.export(builder);
        var pdf =builder.getPdfDocument();

    }
}
