package net.gronostay.grobtree.api.storage;

import java.util.Map;

/**
 * A log storage consisting of separate log messages that are already split in meta-infos and text.
 */
public interface LogStorageMessages extends LogStorage {
    LogStorageMessage addMessage(String message);

    LogStorageMessage addMessage(Map<String, Object> keyValues, String message);

    void clear();
}
