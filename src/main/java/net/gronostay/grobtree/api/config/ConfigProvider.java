package net.gronostay.grobtree.api.config;

import java.util.List;

/**
 * Interface for providing configuration values that can be changed in the settings dialog.
 */
public interface ConfigProvider {
    default List<ConfigValue> getConfigValues(ConfigValueFactory factory) { return List.of(); }
}
