package net.gronostay.grobtree.api.config;

import net.gronostay.grobtree.api.GrobTree;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Factory for creating configuration values (entries in settings dialog).
 */
public interface ConfigValueFactory {
    /**
     * Returns instance of ConfigValueFactory.
     *
     * @return instance of factory
     */
    static ConfigValueFactory getInstance() {
        return GrobTree.getConfigValueFactory();
    }

    /**
     * Create a static text line.
     *
     * @param text to be shown
     * @return ConfigValue of a static text
     */
    ConfigValue createStaticText(String text);

    /**
     * Create a static text line.
     *
     * @param text            to be shown
     * @param hasPreEmptyLine true if a leading space line should be shown
     * @return ConfigValue of a static text
     */
    ConfigValue createStaticText(String text, boolean hasPreEmptyLine);

    /**
     * Create a static text line.
     *
     * @param text        to be shown
     * @param toolTipText for the shown text
     * @return ConfigValue of a static text
     */
    ConfigValue createStaticText(String text, String toolTipText);

    /**
     * Create a static text line.
     *
     * @param text            to be shown
     * @param toolTipText     for the shown text
     * @param hasPreEmptyLine true if a leading space line should be shown
     * @return ConfigValue of a static text
     */
    ConfigValue createStaticText(String text, String toolTipText, boolean hasPreEmptyLine);

    /**
     * Creates a configuration wrapper for a boolean value.
     *
     * @param getter      lambda for getting the value
     * @param setter      lambda for setting the value
     * @param text        The text to be shown.
     * @param toolTipText The tooltip of the text.
     * @return the new ConfigValue
     */
    ConfigValue createBooleanConfigValueWrapper(Supplier<Boolean> getter, Consumer<Boolean> setter, String text, String toolTipText);

    /**
     * Creates a configuration wrapper for a String value.
     *
     * @param getter      lambda for getting the value
     * @param setter      lambda for setting the value
     * @param text        The text to be shown.
     * @param toolTipText The tooltip of the text.
     * @return the new ConfigValue
     */
    ConfigValue createStringConfigValueWrapper(Supplier<String> getter, Consumer<String> setter, String text, String toolTipText);
}
