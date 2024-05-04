package StatePattern;

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        for (int i = 0 ;i<5;i++){
            System.out.println("Eraser!!!!!!! Tool!!!!");
        }
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing Something!");
        System.out.println("YES REALLY! Something!");

    }
}
