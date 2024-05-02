package Memento;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(editor.getContent()); //error
    }
}
