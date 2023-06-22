package dev.safar.mineableblocks.utils;

import org.bukkit.configuration.InvalidConfigurationException;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class Utils {

    public static void configAssertNotNull(Object value, String errorMessage) throws InvalidConfigurationException {
        if (value == null) {
            throw new InvalidConfigurationException("Database type must be present");
        }
    }

    public static void configAssertNotEmpty(Optional<Object> value, String errorMessage) throws InvalidConfigurationException {
        if (value.isEmpty()) {
            throw new InvalidConfigurationException("Database type must be present");
        }
    }

}
