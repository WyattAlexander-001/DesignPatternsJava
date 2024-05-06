package VisitorPattern;

public class HighLightOperation implements Operation {
    @Override
    public void apply(HeadingNode heading) {
        System.out.println("HIGHLIGHT HEADING");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("HIGHLIGHT ANCHOR");
    }
}
