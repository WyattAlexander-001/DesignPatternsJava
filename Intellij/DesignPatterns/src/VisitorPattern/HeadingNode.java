package VisitorPattern;

public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation op) {
        op.apply(this);
    }
}
