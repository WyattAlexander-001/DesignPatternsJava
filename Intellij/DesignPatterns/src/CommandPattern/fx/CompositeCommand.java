package CommandPattern.fx;

import java.util.ArrayList;
import java.util.List;

//Record user actions and player them later
public class CompositeCommand implements Command{
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command: commands){
            command.execute();
        }
    }
}
