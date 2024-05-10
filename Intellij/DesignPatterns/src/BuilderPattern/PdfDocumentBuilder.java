package BuilderPattern;

public class PdfDocumentBuilder implements PresentationBuilder{
    private PdfDocument doc = new PdfDocument();
    @Override
    public void addSlide(Slide slide) {
        doc.addPage(slide.getText());
    }

    public PdfDocument getPdfDocument() {
        return doc;
    }
}
