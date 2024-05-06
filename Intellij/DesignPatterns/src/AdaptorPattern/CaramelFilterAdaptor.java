package AdaptorPattern;

import AdaptorPattern.Example3rdPartyFilters.Caramel;

public class CaramelFilterAdaptor implements Filter{
    private Caramel caramel;

    public CaramelFilterAdaptor(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init(); //required by the Caramel class;
        caramel.render(image); //using the render of Caramel class whihc should mimic and satisfy our apply method
    }
}
