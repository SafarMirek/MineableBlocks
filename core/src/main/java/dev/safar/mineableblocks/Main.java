

package dev.safar.mineableblocks;

import dev.safar.mineableblocks.storage.DataStorage;
import dev.safar.mineableblocks.storage.DatabaseStorageType;
import dev.safar.mineableblocks.utils.Utils;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;

    private MineableBlocksManager mineableBlocksManager;
    private DataStorage dataStorage;

    @Override
    public void onLoad() {
        super.onLoad();
        saveDefaultConfig();
    }

    @Override
    public void onEnable() {
        super.onEnable();
        instance = this;

        try {
            dataStorage = getDataStorage();

            mineableBlocksManager = new MineableBlocksManager(dataStorage);

            // Inject API
            MineableBlocks.api = new MineableBlocksAPIProvider(mineableBlocksManager);

        } catch (InvalidConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    private DataStorage getDataStorage() throws InvalidConfigurationException {
        var databaseConfig = getConfig().getConfigurationSection("database");
        Utils.configAssertNotNull(databaseConfig, "Database type must be present");

        var dbTypeValue = databaseConfig.getString("type");
        Utils.configAssertNotNull(dbTypeValue, "Database type must be present");

        var dbType = DatabaseStorageType.valueOf(dbTypeValue);
        Utils.configAssertNotNull(dbType, "Invalid value for database type");

        //TODO:
    }

    public static Main getInstance() {
        return instance;
    }

}
