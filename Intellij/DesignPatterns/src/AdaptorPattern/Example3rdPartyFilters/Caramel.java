package AdaptorPattern.Example3rdPartyFilters;

import AdaptorPattern.Image;
//SOmeone else made this, so I need to make an adapter, so make a Filter for it, like CaramelFilter
public class Caramel {
    public void init(){
    }

    public void render(Image image){
        System.out.println("Applying Caramel from 3rd party boi");
    }
}
