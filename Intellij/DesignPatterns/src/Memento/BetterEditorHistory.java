package Memento;

import java.util.ArrayList;
import java.util.List;

//Careetaker GOF
public class BetterEditorHistory {
    private List<BetterEditorState> states = new ArrayList<>();

    public void push(BetterEditorState state){
        states.add(state);
    }
    public BetterEditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}
