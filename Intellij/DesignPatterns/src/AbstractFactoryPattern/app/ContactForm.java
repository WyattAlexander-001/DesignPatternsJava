package AbstractFactoryPattern.app;

import AbstractFactoryPattern.Theme;
import AbstractFactoryPattern.WidgetFactory;
import AbstractFactoryPattern.ant.AntTextBox;
import AbstractFactoryPattern.ant.AntButton;
import AbstractFactoryPattern.material.MaterialButton;
import AbstractFactoryPattern.material.MaterialTextBox;

public class ContactForm {
    public void render(WidgetFactory factory){
        factory.createTextBox().render();
        factory.createButton().render();
    }
}
