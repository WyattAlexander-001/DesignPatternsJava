package SingletonPattern;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();

    private static ConfigManager instance = new ConfigManager();

    public static ConfigManager getInstance() {
        return instance;
    }
    private ConfigManager(){}
    public void set(String key, Object val){
        settings.put(key,val);
    }

    public Object get(String key){
        return settings.get(key);
    }


}
