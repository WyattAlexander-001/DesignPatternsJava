package StatePattern;

public class SelectionTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("SELECTION TOOL BOI");
    }

    @Override
    public void mouseUp() {
        System.out.println("DRAW A RECTANGLE!!!! []");
    }
}
