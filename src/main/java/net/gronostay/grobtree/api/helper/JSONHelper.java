package net.gronostay.grobtree.api.helper;

import java.util.List;
import java.util.Map;

/**
 * Interface for JSON methods.
 */
public interface JSONHelper {
    Map<String, Object> getJsonElements(String payload);
    List<String> getJsonNodes(String content);
}