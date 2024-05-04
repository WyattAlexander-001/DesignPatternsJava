package StatePattern;

//Much better! OPEN/CLOSE PRINCIPLE! I can just add new classes for features like Selection, Brush, Eraser!
//But closed to modification!
public interface Tool {
    void mouseDown();
    void mouseUp();
}

//inheritance model, can use interface which we will because they rule
//public abstract class Tool {
//    public abstract void mouseDown();
//    public abstract void mouseUp();
//
//}
