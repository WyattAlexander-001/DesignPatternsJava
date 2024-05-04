package Memento;
//Originator GOF
public class BetterEditor {
    private String content;

    public BetterEditorState createState(){
        return new BetterEditorState(content);
    }


    public void restore(BetterEditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
