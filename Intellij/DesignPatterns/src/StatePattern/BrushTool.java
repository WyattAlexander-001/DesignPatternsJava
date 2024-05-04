package StatePattern;

public class BrushTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("BRUSH BOI");
    }

    @Override
    public void mouseUp() {
        System.out.println("DRAWING DRAWING DRAWING");
    }
}
