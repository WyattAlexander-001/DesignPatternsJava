package StatePattern;

public class Main {
    public static void main(String[] arrgs){
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("\n=============\n");

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.mouseDown();
        canvas.mouseUp();

        System.out.println("\n=============\n");

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
