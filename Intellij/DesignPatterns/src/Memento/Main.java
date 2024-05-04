package Memento;

public class Main {
    public static void main(String[] args) {
        //Versions 1 Basic:
        System.out.println("Memento Example");
        var editor = new Editor();

        editor.setContent("apples");
        editor.setContent("pears");
        editor.setContent("kiwi");

        System.out.println(editor.getContent()); //kiwi
        editor.undo();
        System.out.println(editor.getContent()); //pears
        editor.undo();
        System.out.println(editor.getContent()); //apples
        editor.undo();
        System.out.println(editor.getContent()); //Empty
        System.out.println("\n=====Better Version:========\n");

        //=================== New Version:

        var betterEditor = new BetterEditor();
        var betterEditorHistory = new BetterEditorHistory();

        betterEditor.setContent("Ajax");
        betterEditorHistory.push(betterEditor.createState());
        betterEditor.setContent("Bleach");
        betterEditorHistory.push(betterEditor.createState());
        betterEditor.setContent("Soap");

        System.out.println(betterEditor.getContent()); //Soap
        betterEditor.restore(betterEditorHistory.pop());
        System.out.println(betterEditor.getContent()); //Bleach


    }
}
