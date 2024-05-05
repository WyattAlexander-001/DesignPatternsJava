package CommandPattern.Editor;

public class Main {
    public static void main (String[] args){
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello WORLD");

        var boldCommand = new BoldCommand(document, history);
        var undoCommand = new UndoCommand(history);
        boldCommand.execute();
        System.out.println(document.getContent());
        undoCommand.execute();
        System.out.println(document.getContent());
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
