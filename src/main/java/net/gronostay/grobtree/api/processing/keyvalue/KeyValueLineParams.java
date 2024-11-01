package net.gronostay.grobtree.api.processing.keyvalue;

import net.gronostay.grobtree.api.processing.LineParams;

import java.util.Map;

/**
 * Information about the part covered by the regex to distinguish the lines.
 */
public interface KeyValueLineParams extends LineParams {
    void set(String key, Object value);

    Object getValue(String key);
    Object getValue(String key, Object defaultValue);

    String getValueToString(String key, String defaultString);

    Map<String, Object> getObjectsMap();

    Map<String, String> getValueToStringMap();
    Map<String, String> getValueToStringMap(Object valueForNullValues);

    void clear();
}
