package CommandPattern.fx;

public class BlackAndWhiteCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Black and White command activated!");
    }
}
