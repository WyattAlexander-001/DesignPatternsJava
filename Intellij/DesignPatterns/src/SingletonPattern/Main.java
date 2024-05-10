package SingletonPattern;
// Think of a washing machine, I guess....Or one game state
public class Main {
    public static void main (String[] args){
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name", "Wyatt");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));

    }
}
