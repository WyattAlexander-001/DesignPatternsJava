package Memento;
import java.util.*;
public class Editor {
    private String content;
    ArrayDeque<String> queue = new ArrayDeque<String>();

    public void setContent(String content) {
        this.content = content;
        queue.add(content);
    }

    public String getContent() {
        return queue.getLast();
    }

    public void undo(){
        queue.removeLast();
    }
}
