package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

//Composite, because it's a collection of slides
public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlides(Slide slide){
        slides.add(slide);
    }

    public void export(PresentationBuilder builder){
        builder.addSlide(new Slide("Copyright"));
        for( Slide slide: slides){
            builder.addSlide(slide);
        }


    }
}
