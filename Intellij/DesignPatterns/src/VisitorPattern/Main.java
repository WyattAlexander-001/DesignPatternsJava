package VisitorPattern;

public class Main {
    public static void main (String[] args){
        System.out.println("Visitor Pattern:");
        var doc = new HtmlDocument();
        doc.add(new HeadingNode());
        doc.add(new AnchorNode());
        doc.add(new HeadingNode());
        doc.execute(new HighLightOperation());
    }
}
