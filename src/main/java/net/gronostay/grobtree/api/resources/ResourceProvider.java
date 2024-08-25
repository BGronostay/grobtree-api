package net.gronostay.grobtree.api.resources;

import net.gronostay.grobtree.api.GlobalService;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

/**
 * Retrieves built-in resources (e.g. from IntelliJ).
 */
public interface ResourceProvider {

    static ResourceProvider getInstance() {
        return GlobalService.getInstance().getResourceProvider();
    }

    /**
     * Get all icons.
     *
     * @return A Map of all icons with their string representation (e.g. "JB.AllIcons.Actions.StartDebugger").
     */
    Map<String, Icon> getIcons();

    /**
     * Get a certain icon.
     *
     * @param iconName The string representation of the icon, e.g. "JB.AllIcons.Actions.StartDebugger".
     * @return The icon or null if no icon with the provided name is found.
     */
    Icon getIcon(String iconName);

    /**
     * Get all colors.
     *
     * @return A Map of all colors with their string representation (e.g. "JB.JBColor.RED").
     */
    Map<String, Color> getColors();

    /**
     * Get a certain color.
     *
     * @param colorName The string representation of the color, e.g. "JB.JBColor.RED". Can also be a text attribute in a scheme, e.g. DEFAULT_NUMBER.
     * @return The color or null if no color with the provided name is found.
     */
    Color getColor(String colorName);
}
