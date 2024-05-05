package CommandPattern;

import CommandPattern.fx.*;

// Think GUI(s), decouple invoker and receiver
public class Main {
    public static void main (String[] args){
        System.out.println("Command Pattern:");
        var service = new AppExampleCustomerService(); //new app
        var command = new AddCustomerCommand(service);
        var button = new Button(command);
        button.click();

        //Composite Command Example
        var composite = new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

    }
}
