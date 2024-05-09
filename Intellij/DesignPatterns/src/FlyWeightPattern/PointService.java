package FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class PointService {

    private PointIconFactory iconFactory;

    public PointService(PointIconFactory iconFactory) {
        this.iconFactory = iconFactory;
    }
    public List<PointOfInterest> getPoints(){
        List<PointOfInterest> points = new ArrayList<>();
        var point = new PointOfInterest(1,2, iconFactory.getPointIcon(PointType.CAFE));
        points.add(point);
        return  points;
    }
}
