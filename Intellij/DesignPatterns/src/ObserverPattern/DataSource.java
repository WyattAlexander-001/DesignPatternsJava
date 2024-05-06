package ObserverPattern;

public class DataSource extends Subject{
    private int value; //whenever this changes we need to notify other obj
    private Observer obs;
    public int getValue() {
        return value;
    }

    //Push Style
//    public void setValue(int value) {
//        this.value = value;
//        notifyObservers(value);
//    }

    //Pull Style:
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }


}
