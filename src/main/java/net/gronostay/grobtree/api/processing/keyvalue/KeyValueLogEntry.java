package net.gronostay.grobtree.api.processing.keyvalue;

import net.gronostay.grobtree.api.processing.LogEntry;

import java.util.Map;

public interface KeyValueLogEntry extends LogEntry {
    /**
     * A Map representing the groups in the regex.
     *
     * @return The map.
     */
    Map<String, String> getKeyValueMap();
}
