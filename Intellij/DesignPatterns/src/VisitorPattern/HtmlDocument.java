package VisitorPattern;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {
    private List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node){
        nodes.add(node);
    }
    public void execute(Operation op){
        for (var node : nodes){
            node.execute(op);
        }
    }
}
