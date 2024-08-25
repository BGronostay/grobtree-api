package net.gronostay.grobtree.api.storage;

/**
 * A simple log storage of a string (e.g. a complete log file).
 */
public interface LogStorageString extends LogStorage {
    void set(String content);

    void clear();
}
