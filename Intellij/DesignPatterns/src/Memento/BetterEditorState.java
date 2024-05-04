package Memento;

//Memnto GOF
public class BetterEditorState {
    private final String content;

    public BetterEditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
