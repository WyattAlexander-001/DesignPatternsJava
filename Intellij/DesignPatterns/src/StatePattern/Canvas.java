package StatePattern;

public class Canvas {
    private Tool currentTool;
    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }
    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }



    /*
    //Example of GARBAGE WET CODE
        private ToolType currentTool;
    public void mouseDown(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection tool");
        }else if(currentTool == ToolType.BRUSH){
            System.out.println("Brush tool chosen");
        }else if(currentTool == ToolType.ERASER){
            System.out.println("Wow an Eraser tool");
        }

    }

    public void mouseUp(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("RECTANGLE");
        }else if(currentTool == ToolType.BRUSH){
            System.out.println("LINE");
        }else if(currentTool == ToolType.ERASER){
            System.out.println("ERASE");
        }
    }

    */
}
