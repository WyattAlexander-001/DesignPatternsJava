package AdaptorPattern;

import AdaptorPattern.Example3rdPartyFilters.Caramel;

//Another way to do it using inheritance, not so flexible since multiple inheritance isn't a thing
public class CaramelInheritanceInterface extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init(); //inherits the Caramel methods so no need to make a Caramel obj
        render(image); // ^^

    }
}
