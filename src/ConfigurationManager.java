import java.util.HashMap;
import java.util.Map;
public class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configSettings;

    private ConfigurationManager() {
        configSettings = new HashMap<>();
        configSettings.put("maxPlayers", "100");
        configSettings.put("defaultLanguage", "en");
        configSettings.put("gameDifficulty", "medium");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        return configSettings.getOrDefault(key, "Not Found");
    }

    public void printAllConfigs() {
        configSettings.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
