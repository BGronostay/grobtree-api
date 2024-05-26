package net.gronostay.grobtree.api.processing.keyvalue;

import net.gronostay.grobtree.api.processing.LineParams;

import java.util.Map;

/**
 * Information about the part covered by the regex to distinguish the lines.
 */
public interface KeyValueLineParams extends LineParams {
    /**
     * A Map representing the groups in the regex.
     *
     * @return The map.
     */
    Map<String, String> getKeyValueMap();
}
