package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer obs){
        observers.add(obs);
    }

    public void removeObserver(Observer obs){
        observers.remove(obs);

    }
    //Pull Style
    public void notifyObservers(){
        for (var obs : observers){
            obs.update();
        }
    }

    //Push Style
//    public void notifyObservers(int value){
//        for (var obs : observers){
//            obs.update(value);
//        }
//    }


}
