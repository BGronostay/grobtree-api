package net.gronostay.grobtree.api.storage;

import net.gronostay.grobtree.api.processing.LineParams;

import java.util.Map;

/**
 * A log storage consisting of separate log messages that are already split in meta-infos and text.
 */
public interface LogStorageMessages extends LogStorage {
    LogStorageMessage addMessage(String message);

    LogStorageMessage addMessage(Map<String, Object> keyValues, String message);

    LogStorageMessage addMessage(LineParams lineParams, String text);

    void reverse();

    void clear();
}
