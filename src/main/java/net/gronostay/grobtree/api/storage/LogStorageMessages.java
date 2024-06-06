package net.gronostay.grobtree.api.storage;

import java.util.Map;

public interface LogStorageMessages extends LogStorage {
    void addMessage(String message);
    void addMessage(Map<String, String> keyValues, String message);
    void addMessage(Map<String, String> keyValues, int length, String message);
    void clear();
}
