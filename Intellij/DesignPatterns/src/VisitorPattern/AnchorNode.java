package VisitorPattern;

public class AnchorNode implements HtmlNode {
    @Override
    public void execute(Operation op) {
        op.apply(this); //this is the anchor node
    }
}
