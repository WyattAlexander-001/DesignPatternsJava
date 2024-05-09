package FlyWeightPattern;
// GPS Map idea
public class PointOfInterest {
    private int x;
    private int y;
    private PointIcon icon;

    public PointOfInterest(int x, int y, PointIcon icon) {
        this.x = x;
        this.y = y;
        this.icon =  icon;

    }

    public void draw(){
        System.out.printf("%s at (%d , %d)", icon.getType(), x, y);
    }

}
