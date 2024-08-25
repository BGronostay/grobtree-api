package net.gronostay.grobtree.api.storage;

import java.util.Map;

/**
 * A log storage consisting of separate log messages that are already split in meta-infos and text.
 */
public interface LogStorageMessages extends LogStorage {
    void addMessage(String message);

    void addMessage(Map<String, String> keyValues, String message);

    void addMessage(Map<String, String> keyValues, int length, String message);

    void clear();
}
