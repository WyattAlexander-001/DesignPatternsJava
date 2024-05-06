package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Group implements Component{
    private List<Component> components = new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    public void render(){
        for (var component : components){
            component.render();
        }
    }

    //Example of adding a new feature easily
    @Override
    public void move() {
        for (var component : components){
            component.move();
        }
    }
}
