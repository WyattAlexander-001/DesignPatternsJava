package AdaptorPattern;

import AdaptorPattern.Example3rdPartyFilters.Caramel;

public class Main {
    public static void main (String[] args){
        var imageView = new ImageView(new Image());
        imageView.apply(new VividFilter());
        //imageView.apply(new Caramel()); //Will not work since it doesn't implement or apply filter

    }
}
