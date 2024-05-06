package CompositePattern;
//Think in photoshop groups, like two groups of shapes, treat objects the same way
public class Main {
    public static void main (String[] args){
        var group1 = new Group();
        group1.add(new Shape()); //Square
        group1.add(new Shape());

        var group2 = new Group();
        group2.add(new Shape()); //circle
        group2.add(new Shape());

        var group = new Group();
        group.add(group1);
        group.add(group2);
        group.render();
        group.move();


    }
}
